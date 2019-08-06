package grades;

import java.util.ArrayList;
import java.util.List;

//Create a class named Student
public class Student {
//    It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.
    private String name;
    private ArrayList<Integer> grades;

//    The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList
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
        int total = 0;
        for (int grade: this.grades){
            total += grade;
        }
        return total / this.grades.size();
    }

//    public static void main(String[] args) {
//        Student alicia = new Student ("Alicia");
//        alicia.addGrade(90);
//        alicia.addGrade(78);
//        alicia.addGrade(97);
//        System.out.println(alicia.getGradeAverage());
//    }
}
