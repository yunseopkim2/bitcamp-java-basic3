package calc;

import java.util.Scanner;
/**
 * packageName: calc
 * fileName   : CalcDemo
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : 4칙 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaclApp caclApp = new CaclApp();
        System.out.println(caclApp.CALC_APP);
        System.out.println("첫번째 숫자");
        int num1 = scanner.nextInt();
        System.out.println("연산자 + - * /");
        String opcode = scanner.next();
        System.out.println("두번째 숫자");
        int num2 = scanner.nextInt();
        String res = caclApp.calc(num1, opcode, num2);
        System.out.println(res);
    }
}
