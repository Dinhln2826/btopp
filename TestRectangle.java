public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f,3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(0, 0);
        System.out.println(r2);
        r1.setlength(5.6f);
        r1.setwidth(7.8f);
        System.out.println(r1);
        System.out.println("lenght is:"+ r1.getlength());
        System.out.println("width is:"+ r1.getwidth());
        System.out.println(r1);
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
        

    }
}
