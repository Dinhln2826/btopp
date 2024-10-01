public class Testmain {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("area is: "+ c1.getArea());
        System.out.println("circumfenrence is:"+ c1.getCircumference());

    }
    
}
