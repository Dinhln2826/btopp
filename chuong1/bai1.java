import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x;
       System.out.print("nhập số ");
       x = Math.toRadians(sc.nextDouble());
       System.out.println("cos x="+Math.cos(x));
       System.out.println("sin x="+Math.sin(x));
       sc.close();
    }
}