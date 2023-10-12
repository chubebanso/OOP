import java.util.Scanner;

public class FirstDegree {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap a:");
        a = sc.nextDouble();
        System.out.print(" Nhap b:");
        b = sc.nextDouble();
        if (a == 0) {
            System.out.print("Nhap lai:");
            a = sc.nextDouble();
        }
        System.out.println("Nghiem cua pt la:" + (-b / a));
    }
}
