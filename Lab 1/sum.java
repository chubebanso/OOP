import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a:");
        a = sc.nextDouble();
        System.out.print("Nhap b:");
        b = sc.nextDouble();
        System.out.println("a+b=" + (a + b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a-b=" + (a - b));
    }
}