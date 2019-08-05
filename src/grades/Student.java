package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name=name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }
        return Math.round(total / this.grades.size());
    }

    public static void main(String[] args) {
        Student alicia = new Student ("Alicia");
        alicia.addGrade(90);
        alicia.addGrade(78);
        alicia.addGrade(97);
        System.out.println(alicia.getGradeAverage());
    }
}
