import java.util.ArrayList;

public class Student {
    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        ArrayList<Integer> grades = this.grades;
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
    public void updateGrade(int index, int grade){
        this.grades.set(index, grade);
    }
    public void deleteGrade(int index){
        this.grades.remove(index);
    }
}
