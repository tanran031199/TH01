package TH.TH01;

import java.util.Scanner;

public class ThucHanh01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất: ax + b = c");

        System.out.println("Nhập a:");
        double a = sc.nextDouble();
        System.out.println("Nhập b:");
        double b = sc.nextDouble();
        System.out.println("Nhập c:");
        double c = sc.nextDouble();
        double x;

        if (a == 0) {
            System.out.println(b == c ? "Phương trình vô số nghiệm" : "Phương trình vô nghiệm");
        } else {
            if (b == 0) {
                x = c / a;
            }
            x = (c - b) / a;
            System.out.println("x = " + x);
        }
    }
}
