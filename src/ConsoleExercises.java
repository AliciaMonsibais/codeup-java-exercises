import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        int userInt = scanner.nextInt();
        System.out.println(userInt);
        scanner.nextLine();

        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        scanner.nextLine();

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Here is your sentence: %s%n", sentence);

        System.out.println("Enter the length and width of the room.");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The area of the classroom is %.2f sqft, the perimeter is %.2f ft.", area, perimeter);


    }
}
