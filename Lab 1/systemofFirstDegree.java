import java.util.Scanner;

public class systemofFirstDegree {
    public static void main(String[] args) {
        double a11, a12, a21, a22, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a11,a12,a21,a22:");
        a11 = sc.nextDouble();
        a12 = sc.nextDouble();
        a21 = sc.nextDouble();
        a22 = sc.nextDouble();
        b = sc.nextDouble();
        double D = a11 * a22 - a12 * a21;
        double D1 = b * a22 - b * a21;
        double D2 = a11 * b - a12 * b;
        if (D != 0) {
            System.out.println("Nghiem cua he phuong trinh la:" + (D1 / D) + " " + (D2 / D));

        } else if ((D == 0) && ((D1 != 0) || (D2 != 0))) {
            System.out.println("He pt vo nghiem");
        } else if (D == D1 && (D == D2) && (D == 0)) {
            System.out.println("He pt vo so nghiem");
        }
    }
}
