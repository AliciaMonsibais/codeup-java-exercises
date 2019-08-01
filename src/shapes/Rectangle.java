package shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length * 2) + (this.width *2);
    }
}
