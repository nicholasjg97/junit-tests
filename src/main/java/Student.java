import java.util.ArrayList;

public class Student {

    private long id;

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(Integer grade : grades) {
            total += grade;
        }
        return total / this.grades.size();
    }










}
