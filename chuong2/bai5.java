import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String Name;
        int age;
        String address;
        double toan;
        double van;
        double anh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        Name =sc.nextLine();
        System.out.print("age:");
        age =sc.nextInt();
        sc.nextLine();
        System.out.print("address:");
        address =sc.nextLine();
        System.out.print("nhập điểm toán:");
        toan =sc.nextDouble();
        System.out.print("nhập điểm văn:");
        van =sc.nextDouble();
        System.out.print("nhập điểm anh:");
        anh =sc.nextDouble();
        System.out.println("DTB toán văn anh:"+((toan + van + anh)/3));
        sc.close();
    }
}
