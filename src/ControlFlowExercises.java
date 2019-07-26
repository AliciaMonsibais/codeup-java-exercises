import java.util.Scanner;
public class ControlFlowExercises {
    //    static void fizzBuzz(int num){
//        for (int i = 1; i <= num; i++) {
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
    public static void main(String[] args) {
//        fizzBuzz(100);
//        int i = 5;
//        while (i < 15) {
//            System.out.println(i);
//            i++;
//        }
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);
//        {
//            int y = 100;
//            do {
//                System.out.println(y);
//                y -= 5;
//            } while (y >= -10);
//        }
//        for (long k = 2; k <= 1000000; k *= k) {
//            System.out.println(k);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int stop = sc.nextInt();
        System.out.println("Do you want to continue?");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
            String numTable = "Number  |  Squared  |  Cubed \n------  |  ------   | ------";
            System.out.println("Here is your table!");
            System.out.printf(numTable + "%n");
            for (int i = 1; i <= stop; i++) {
                    System.out.printf("%-8d| %-9d | %-8d%n", i, i*i, i*i*i);
            }
        } else {
            System.out.println("So long, farewell, auf Wiedersehen, good night.");
        }
        boolean allTheGrades = true;
        do {
            System.out.println("What is your numerical grade?");
            int grade = sc.nextInt();
            System.out.println("Would you like to continue?");
            String gradeAnswer = sc.next();
            if (gradeAnswer.equalsIgnoreCase("yes")) {
                if (grade < 60) {
                    System.out.printf("Your grade is %d. You got an F.%n", grade);
                } else if ((grade >= 96) && (grade <= 100)) {
                    System.out.printf("Your grade is %d. You got an A+!%n", grade);
                } else if ((grade >= 92) && (grade <= 95)) {
                    System.out.printf("Your grade is %d. You got an A!%n", grade);
                } else if ((grade >= 88) && (grade <= 91)) {
                    System.out.printf("Your grade is %d. You got an A-!%n", grade);
                } else if ((grade >= 86) && (grade <= 87)) {
                    System.out.printf("Your grade is %d. You got an B+!%n", grade);
                } else if ((grade >= 83) && (grade <= 85)) {
                    System.out.printf("Your grade is %d. You got an B!%n", grade);
                } else if ((grade >= 80) && (grade <= 82)) {
                    System.out.printf("Your grade is %d. You got an B-.%n", grade);
                } else if ((grade >= 76) && (grade <= 79)) {
                    System.out.printf("Your grade is %d. You got a C+.%n", grade);
                } else if ((grade >= 71) && (grade <= 75)) {
                    System.out.printf("Your grade is %d. You got a C.%n", grade);
                } else if ((grade >= 67) && (grade <= 70)) {
                    System.out.printf("Your grade is %d. You got a C-.%n", grade);
                } else if ((grade >= 65) && (grade <= 66)) {
                    System.out.printf("Your grade is %d. You got a D+.%n", grade);
                } else if ((grade >= 62) && (grade <= 64)) {
                    System.out.printf("Your grade is %d. You got a D.%n", grade);
                } else {
                    System.out.println("Try again.");
                }
                System.out.println("Would you like to input another grade?");
                String respond = sc.next();
                if (!respond.equals("yes")) {
                    allTheGrades = false;
                }
            } else {
                System.out.println("Logging out. Beep boop.");
            }
        }
        while (allTheGrades);
        System.out.println("Goodbye. Beep. Boop.");
    }
}
