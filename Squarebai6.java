public class Squarebai6 extends Rectanglebai6 {
    public Squarebai6() {
        super(1.0, 1.0);
    }

    public Squarebai6(double side) {
        super(side, side);
    }

    public Squarebai6(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}