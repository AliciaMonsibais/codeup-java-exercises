package shapes;

public class Square extends Rectangle {

    public Square(double length) {
        super (length, length);
    }

    void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
//    protected double side;
//    public Square(double side) {
//        super (side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * this.side;
//    }
//    public double getArea() {
//        return Math.pow(side,2);
//    }
}
