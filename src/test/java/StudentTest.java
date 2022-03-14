import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void studentConstructor(){
        Student testStudent = new Student(1, "Kat");
        long testId = 1;
        String testName = "Kat";
        ArrayList<Integer> testList = new ArrayList<>();

        assertEquals(testId, testStudent.id);
        assertEquals(testName, testStudent.name);
        assertEquals(testList, testStudent.grades);
    }
    @Test
    public void getIdMethod(){
        Student testStudent = new Student(1, "Kat");
        long testId = 1;

        assertEquals(testId, testStudent.getId());
    }
    @Test
    public void getNameMethod(){
        Student testStudent = new Student(1, "Kat");
        String testName = "Kat";

        assertEquals(testName, testStudent.getName());
    }
    @Test
    public void addGradeMethod(){
        Student testStudent = new Student(1, "Kat");
        testStudent.addGrade(100);
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(100);

        assertEquals(testList, testStudent.grades);
    }
    @Test
    public void getGradeAverageMethod(){
        Student testStudent = new Student(1, "Kat");
        testStudent.addGrade(100);
        testStudent.addGrade(80);
        testStudent.addGrade(100);
        double testAverage = 93.3;

        assertEquals(testAverage, testStudent.getGradeAverage(), 0.3);
    }
    @Test
    public void updateGradeMethod(){
        Student testStudent = new Student(1, "Kat");
        testStudent.addGrade(100); // 0
        testStudent.addGrade(70); // 1
        testStudent.addGrade(100); // 2
        testStudent.updateGrade(1, 80);
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(100, 80, 100));

        assertEquals(testList, testStudent.grades);
    }
    @Test
    public void deleteGradeMethod(){
        Student testStudent = new Student(1, "Kat");
        testStudent.addGrade(100);
        testStudent.addGrade(80);
        testStudent.addGrade(100);
        testStudent.deleteGrade(1);
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(100, 100));

        assertEquals(testList, testStudent.grades);
    }
}
