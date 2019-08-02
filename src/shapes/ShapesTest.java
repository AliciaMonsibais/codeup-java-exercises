package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1 = new Square(6);
        Measurable myShape2 = new Rectangle(3,5);

        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape2.getPerimeter());
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
