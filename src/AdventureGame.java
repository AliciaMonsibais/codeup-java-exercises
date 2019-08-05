import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class AdventureGame {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String startGame = "You awaken to an unknown place. The floor below you is cold and damp. You're outside? That's weird. You don't see anything as you look around. It's just pure darkness except for the part you're standing in, which is light.";
    String forestCry = "A dark figure approaches through the shrubbery. You breathe a sigh of relief that someone heard your cries and is here to help! Your smile slowly fades form your face as your hear the all-too-familiar sound of a *schling* You know the stranger drew a sword.\n" + "As the stranger enters the light, you see a tall man man with a rusty sword drawn. He grins to show his rotting teeth. \"I see you have awakened sooner than I expected. Guess I'll just have to go with plan B.\"\n" + "The man is about to attack you!";
    String searchForest = "You found a rusty dagger!";

    boolean newGame = true;
    boolean hasDagger = false;

    System.out.println("Hello! Please enter your name.");
    String heroName = sc.nextLine();
    System.out.printf("Welcome, %s! Are you ready for an adventure?\n", heroName);
    String startAnswer = sc.next();
    if (startAnswer.equalsIgnoreCase("yes") || startAnswer.equalsIgnoreCase("y")) {
        System.out.println("Great! Let's play! \n");
    } else if(startAnswer.equalsIgnoreCase("no") || startAnswer.equalsIgnoreCase("n")){
        System.out.println("Your great adventure awaits! What are you waiting for?");
    }
         while (newGame) {
             System.out.println(startGame);
             System.out.println("What do you do?\n" +
                     "[1]Cry for help\n" +
                     "[2]Search surrounding area\n");
             String forestCommand = sc.nextLine();
             if (forestCommand.equals("1")) {
                 System.out.println(forestCry);
             } else if (forestCommand.equals("2")) {
                 System.out.println(searchForest);
                 hasDagger = true;
                 System.out.printf("%s, what shall you do?\n", heroName);
                 System.out.println("[1]Yell into the forest\n" +
                         "[2] Search blindly for a way out.");
                 String secondForestCommand = sc.nextLine();
                 if (secondForestCommand.equals("1")  && hasDagger){
                     System.out.println(forestCry);
                     System.out.printf("Do you have a plan to get out of this, %s?", heroName);
                 }
             } else {
                 System.out.println("Try again.");
             }
         }
    }
}
