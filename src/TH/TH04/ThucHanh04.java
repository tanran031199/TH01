package TH.TH04;

import java.util.Scanner;

public class ThucHanh04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tính chỉ số BMI:");

        System.out.println("Nhập chiều cao tính theo m");
        double h = sc.nextDouble();
        System.out.println("Nhập cân nặng");
        double w = sc.nextDouble();

        double bmi = w / Math.pow(h, 2);

        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        System.out.println(bmi < 18.5 ? "Bạn hơi gầy" :
                bmi < 25 ? "Chỉ số của bạn đạt tiêu chuẩn" : bmi < 30 ?
                        "Bạn hơi béo" : "Bạn thừa cân rồi");
    }
}
