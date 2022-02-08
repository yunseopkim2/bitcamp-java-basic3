package com.example.basic.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.basic.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : kimyunseop
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-08   yunseopkim        최초 생성
 */
public class Feb08ServiceImpl implements  Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        /** 1) 서로 다른 6개의 정수를 저장할 배열을 선언한다
         * 2) 1~45 사이의 임의의 정수를 만든다.
         * 3) 얻은 정수가 배열에 포함된 수인지 확인하고 포함되지 않은 정수만 배열에 저장한다
         * 4) 같은 방법으로 서로 다른 6개의 수가 배열에 저장될 때까지 반복한다.
         * 로또 i번째 칸이랑 i보다 작은 칸들의 인덱스랑 다 비교해서 그 인덱스들이 서로 같지 않을 때까지 반복한다.
         * 인덱스가 같은게 나오면 i 반복수를 줄이고, 해당 검열 반복문을 종료한다.
         */
            int lotto[] = new int[6];
        System.out.println("로또 당첨 번호 : ");
            for(int i = 0; i< lotto.length; i++) {
                int num = (int) (Math.random() * 45) + 1;
                lotto[i] = num;
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;

                    }
                }
            }
                for(int i = 0; i< lotto.length; i++) {
                    System.out.println( lotto[i]);
                }
            }



    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {
        String [][] seat = new String[7][7];
        String [] list = {"A","B","C","D","E","F","G"};
        for(int i =0; i<7;i++){
            for (int j=0; j<7;j++){
                seat[i][j] = " □ ";}}
        while (true){
            System.out.println("\n원하시는 메뉴번호를 입력 해주세요.\n0.Exit 1.예약조회 2.예약신청 3.예약취소");
            int select = scanner.nextInt();
            switch (select){
                case 0:
                    System.out.println("종료");return;

                case 1 : {for (int i = 0; i < 7; i++) {
                    System.out.print("\n" + list[i] + " ");
                    for (int j = 0; j < 7; j++) {
                        System.out.print(seat[i][j]);}}}break;

                case 2:
                    System.out.println("행번호를을 입력해주세요. A(1) ~ G(7) ");
                    int row = scanner.nextInt() - 1;
                    while (row > 6){
                        System.out.println("존재하지 않는 행입니다.");return;
                    }
                    System.out.println("열번호를 입력해주세요. 1 ~ 7");
                    int col = scanner.nextInt() - 1;
                    while (col > 6){
                        System.out.println("존재하지 않는 열입니다.");return;
                    }
                    seat[row][col] = " ■ ";
                    System.out.println("예약 신청되었습니다.");
                    break;

                case 3:
                    System.out.println("행번호를을 입력해주세요. A(1) ~ G(7)");
                    int row2 = scanner.nextInt() - 1;
                    while (row2 > 6){
                        System.out.println("존재하지 않는 행입니다.");return;
                    }
                    System.out.println("열번호를 입력해주세요. 1 ~ 7");
                    int col2 = scanner.nextInt() - 1;
                    while (col2 > 6){
                        System.out.println("존재하지 않는 열입니다.");return;
                    }
                    seat[row2][col2] = " □ ";
                    System.out.println("예약이 취소되었습니다.");
                    break;
                default:System.out.println("존재하지 않는 메뉴번호 입니다.");break;
            }
        }
        }


    @Override
    public void bank(Scanner scanner) {
        int money = 0;
        System.out.println("이름 입력");
        String name = scanner.next();
        System.out.println("계좌 비밀번호 입력");
        int pw = scanner.nextInt();
        System.out.println("계좌 인증 완료");
        while (true) {
            System.out.println("0.종료 1.입금 2.출금 3.잔고");
            int input = scanner.nextInt();
            switch (input) {
                case 0 :
                    System.out.println("종료"); return;
                case 1 :
                    System.out.println("입금 : ");
                    money += scanner.nextInt();
                    break;
                case 2 :
                    System.out.println("출금 :");
                    money -= scanner.nextInt();
                    break;
                case 3 :
                    System.out.println(name + "님의 잔고 : " + money + "원");
                    break;
                default:
                    System.out.println("0~3 입력"); break;
            }
        }

    }

    @Override
    public void gugudan(Scanner scanner) {
        /** int a = (int) (Math.random() * 9 + 1);
         int b = (int) (Math.random() * 9 + 1);
         int res = a * b;

         System.out.println(a + "*" + b + "= ?");
         int input = scanner.nextInt();
         System.out.println((input == res) ? "정답입니다." : "오답입니다.");
         */
        System.out.println("출력할 단을 입력하세요 : ");
        int i = scanner.nextInt();
        for (int j = 1; j < 10; j++) {
            System.out.println(i + "*" + j + "=" + i * j);
        }
    }

}
