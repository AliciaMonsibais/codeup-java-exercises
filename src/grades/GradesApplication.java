package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;
//Create a class named GradesApplication with a main method.
public class GradesApplication {
    //Inside the main method, create a HashMap named students.
    static Map<String, Student> students;

//    It should have keys that are strings that represent GitHub usernames, and values that are Student objects.
    private static void create() {
        students = new HashMap<>();

//        Create at least 4 student objects with at least 3 grades each, and add them to the map.
        Student hermione = new Student("Hermione Granger");
        hermione.addGrade(100);
        hermione.addGrade(100);
        hermione.addGrade(100);
        students.put("hgranger", hermione);

        Student luna = new Student("Luna Lovegood");
        luna.addGrade(96);
        luna.addGrade(94);
        luna.addGrade(100);
        students.put("llovegood", luna);

        Student harry = new Student("Harry Potter");
        harry.addGrade(85);
        harry.addGrade(83);
        harry.addGrade(81);
        students.put("theharrypotter", harry);

        Student ron = new Student("Ron Weasley");
        ron.addGrade(83);
        ron.addGrade(87);
        ron.addGrade(79);
        students.put("ronweasley3", ron);

        Student draco = new Student("Draco Malfoy");
        draco.addGrade(85);
        draco.addGrade(87);
        draco.addGrade(89);
        students.put("dmalfoy", draco);


    }

//    Create the command line interface
    private static void greeting() {

//        Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map).
        System.out.printf("Welcome!\n");
        String usernames = "|";
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.printf("\n" + "Here are the WizardHub usernames of our students:\n" + usernames);
        System.out.println();
    }
    private static void studentInfo(String key) {
//        If the given username does exist, display information about that student, including their name and their grades.
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - WizardHub Username: %s%n", students.get(key).getName(), key);
            System.out.printf("Current Average: %.0f%n%n", students.get(key).getGradeAverage());
        } else {
//            If the given input does not match up with a key in your map, tell the user that no users with that username were found.
            System.out.printf("Sorry, no student was found with \"%s.\"%n", key);
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        create();
        greeting();
        boolean keepGoing;

        do {
            System.out.println("What student would you like to see more information on?");
            String studentChoice = input.getString();
            System.out.println();

            studentInfo(studentChoice);

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
        } while (keepGoing);
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
