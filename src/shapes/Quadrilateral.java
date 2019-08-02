package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
    abstract void setLength(double length);
    abstract void setWidth(double width);

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
    public  double getArea() {
        return this.length * this.width;
    }
}
