package TH.TH03;

import java.util.Scanner;

public class ThucHanh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập năm muốn tính: ");
        int y = sc.nextInt();

        if (y < 0) {
            System.out.println("Xin hãy nhập năm sau công nguyên");
        } else {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0) {
                        System.out.println(y + " là năm nhuận");
                    } else {

                        System.out.println(y + " không phải là năm nhuận");
                    }
                }
            } else {
                System.out.println(y + " không phải là năm nhuận");
            }
        }
    }
}
