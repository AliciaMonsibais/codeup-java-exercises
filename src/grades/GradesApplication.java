package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    static Map<String, Student> students;
    private static void init() {
        students = new HashMap<>();

        Student hermione = new Student("Hermione");
        hermione.addGrade(100);
        hermione.addGrade(100);
        hermione.addGrade(100);

        Student luna = new Student("Luna");
        luna.addGrade(96);
        luna.addGrade(94);
        luna.addGrade(100);

        Student harry = new Student("Harry");
        harry.addGrade(85);
        harry.addGrade(83);
        harry.addGrade(81);

        Student ron = new Student("Ron");
        ron.addGrade(83);
        ron.addGrade(87);
        ron.addGrade(79);

        Student draco = new Student("Draco");
        draco.addGrade(85);
        draco.addGrade(87);
        draco.addGrade(89);

        students.put("hgranger", hermione);
        students.put("llovegood", luna);
        students.put("theharrypotter", harry);
        students.put("ronweasley3", ron);
        students.put("dmalfoy", draco);
    }

    private static void welcome() {
        System.out.printf("Welcome!\n");
        String usernames = "|";
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.printf("\n" + "Here are the GitHub usernames of our students:\n" + usernames);
        System.out.println();
    }
    private static void outputStudentRecord(String key) {
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - Github Username: %s%n", students.get(key).getName(), key);
            System.out.printf("Current Average: %.2f%n%n", students.get(key).getGradeAverage());
        } else {
            System.out.printf("Sorry, no student was found with \"%s.\"%n", key);
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        init();
        welcome();
        boolean keepGoing = true;

        do {
            System.out.println("What student would you like to see more information on?");
            String studentChoice = input.getString();
            System.out.println();

            outputStudentRecord(studentChoice);

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
            System.out.println("Goodbye, and have a wonderful day!");
        } while (keepGoing);
    }
}
