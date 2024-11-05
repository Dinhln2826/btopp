public class Criclebai6 extends Shape {
    protected double radius;

    public Criclebai6() {
        this.radius = 1.0;
    }

    public Criclebai6(double radius) {
        this.radius = radius;
    }

    public Criclebai6(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius; 
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() { 
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + this.radius + "]";
    }
}