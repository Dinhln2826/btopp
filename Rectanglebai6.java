public class Rectanglebai6 extends Shape {
    protected double width;
    protected double length;

    public Rectanglebai6() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectanglebai6(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectanglebai6(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() { 
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", length=" + length + ", width=" + width + "]";
    }
}