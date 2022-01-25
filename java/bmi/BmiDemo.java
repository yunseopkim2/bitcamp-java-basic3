package bmi;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * packageName: bmi
 * fileName   : BmiDemo
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : BmiApp을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiAPP bmiAPP = new BmiAPP();
        System.out.println(BmiAPP.BMI_APP);
        System.out.println("이름");
        String 이름 = scanner.next();
        System.out.println("몸무게");
        Double num1 = scanner.nextDouble();
        System.out.println("키");
        Double num2 = scanner.nextDouble();
        String res = bmiAPP.Bmi(이름, num1, num2);
        System.out.println(res);

    }
}
