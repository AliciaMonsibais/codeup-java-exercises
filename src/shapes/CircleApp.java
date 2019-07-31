package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println("Area of Circle = " + circle.getArea());
        System.out.println("Circumference of Circle = " + circle.getCircumference());

        /*Bonus

        After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.*/
//        System.out.println("\nWould you like to make another circle? \n");
//        input.yesNo();
//        if (input == true) {

//        }
    }

}
