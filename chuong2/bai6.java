import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        double benefit;
        double income;
        double cost;
        String name;
        String address;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        name =sc.nextLine();
        System.out.print("address:");
        name =sc.nextLine();
        System.out.print("income:");
        income =sc.nextDouble();
        System.out.print("cost:");
        cost =sc.nextDouble();
        benefit = income - cost;
        System.out.println("phúc lợi cty là:"+(benefit));
    }
    
}
