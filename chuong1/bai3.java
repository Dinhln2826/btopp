import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int chieudai;
        Scanner sc = new Scanner(System.in);
        int chieurong;
        System.out.print("nhập chiều dài:");
        chieudai=sc.nextInt(); 
        System.out.print("nhập chiều rộng:");
        chieurong=sc.nextInt();
        System.out.println("chu vi hcn là: "+(chieudai + chieurong));
        System.out.println("diện tích hcn là: "+(chieudai * chieurong));
        sc.close();
    }
    
}
