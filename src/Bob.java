import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Say something to Bob, our angsty teen.");
        String userInput;
        do {
            userInput = sc.next();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.equalsIgnoreCase("Bye")) {
                System.out.println("*Bob ignores you*");
                break;
            } else {
                System.out.println("Whatever. *hair flip*");
            }
        } while (true);
    }
}
