package TH.TH02;

import java.util.Scanner;

public class ThucHanh02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tháng muốn tính ngày: ");
        int m = sc.nextInt();

        if (m > 0 && m <= 12) {
            if (m < 8) {
                if (m == 2) {
                    System.out.println("Tháng " + m + " có 28 hoặc 29 ngày");
                } else {
                    System.out.println(m % 2 == 0 ? "Tháng " + m + " có 30 ngày" : "Tháng " + m + " có 31 ngày");
                }
            } else {
                System.out.println(m % 2 == 0 ? "Tháng " + m + " có 31 ngày" : "Tháng " + m + " có 30 ngày");
            }
        } else {
            System.out.println("Không có tháng bạn vừa nhập!! vui lòng nhập lại");
        }
    }
}
