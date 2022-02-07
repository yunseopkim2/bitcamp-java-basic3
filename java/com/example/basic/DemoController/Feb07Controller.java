package com.example.basic.DemoController;

import com.example.basic.service.Feb07Service;
import com.example.basic.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.basic.DemoController
 * fileName   : Fre07Controller
 * author     : kimyunseop
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-07   yunseopkim        최초 생성
 */
public class Feb07Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();
        while (true){
            System.out.println("MENU\n" +"0.EXIT \n" +
                    "1.주사위(dice)\n"+
                    "2.가위바위보(Rps) \n"+
                    "3.입력받은 수 사이의 있는 소수 구하기(getPrime) \n"+
                    "4.자바로 입력받은 연도가 윤년인지 평년이지 판단하기(leapYear) \n"+
                    "5.임의로 입력받은 숫자 맟추기 (numberGolf)");
            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템 종료");return;
                case "1" :
                    System.out.println("랜덤 주사위");
                    service.dice(scanner);break;
                case "2" :
                    service.rps(scanner);break;
                case "3" :
                    System.out.println("소수 구하기");
                    service.getPrime(scanner);break;
                case "4" :
                    System.out.println("연도를 입력하시오");
                    service.leapYear(scanner);break;
                case "5" :
                    System.out.println("Up & Down 게임");
                    service.numberGolf(scanner);break;
                default:
                    System.out.println("잘못된 입력입니다.");break;

            }
        }
    }
}
