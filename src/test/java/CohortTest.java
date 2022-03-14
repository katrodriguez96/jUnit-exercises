import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CohortTest {
    @Test
    public void addStudentsAndGetList(){
        Cohort testCohort = new Cohort();
        Student testStudent = new Student(1, "Kat");
        testCohort.addStudent(testStudent);
        List<Student> testList = new ArrayList<>();
        testList.add(testStudent);

        assertEquals(testList, testCohort.getStudents());
    }
    @Test
    public void getCohortAverageMethod(){
        Cohort testCohort = new Cohort();
        Student testStudent1 = new Student(1, "Kat");
        Student testStudent2 = new Student(2, "Hazel");
        testStudent1.addGrade(100);
        testStudent1.addGrade(80);
        testStudent1.addGrade(100); // 93.3
        testStudent2.addGrade(100);
        testStudent2.addGrade(90);
        testStudent2.addGrade(70); // 86.6
        testCohort.addStudent(testStudent1);
        testCohort.addStudent(testStudent2);
        double testAverage = 90.0;

        assertEquals(testAverage, testCohort.getCohortAverage(), 0);
    }
}
