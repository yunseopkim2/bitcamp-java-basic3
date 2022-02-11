package com.example.basic.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.basic.service
 * fileName   : Feb07ServiceImpl
 * author     : kimyunseop
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-07   yunseopkim        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {

    /*
     *    author     : 김윤섭
     * */
    @Override
    public void dice(Scanner scanner) {
        //(int) (math.random() * 최댓값) + 최솟값
        String s = "";
        int num = (int)(Math.random() * 6) + 1;
        switch (num){
            case 1 : s = "1번";break;
            case 2 : s = "2번";break;
            case 3 : s = "3번";break;
            case 4 : s = "4번";break;
            case 5 : s = "5번";break;
            case 6 : s = "6번";break;

        }


        System.out.println(s);

    }

    @Override
    public void rps(Scanner scanner) {

    }
    /*
     *    author     : 최민서
     * */
    @Override
    public void getPrime(Scanner scanner) {
            System.out.println("두 수를 입력하시오.");
            System.out.println("num 1");
            int num1 = scanner.nextInt();
            System.out.println("num 2");
            int num2 = scanner.nextInt();
            int count=0;
            for(int i = num1; i <= num2; i++) {
                for(int j=2; j<=i; j++) {
                    if(i%j ==0) {
                        count ++;
                    }
                }
                if(count==1){
                    System.out.println(i+" ");
                }
                count=0;
            }

    }
    /*
     *    author     : 김승현
     * */
    @Override
    public void leapYear(Scanner scanner) {
        int year = scanner.nextInt();
        System.out.println((year % 4 == 0)&&(year % 100 != 0)||(year % 400==0)?"윤년입니다":"평년입니다");
    /*
    풀이자 : 김승현
    아래 식을 삼항연산자을 이용해 위의 식으로 만들었다.
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        res = year + "년은 윤년";
    } else {
        res = year + "년은 평년";
    }
    System.out.println(res);
    위의 식은 if else 문을 사용하였다. year값은 입력 받아 if문에 넣어 4로 나눈값이 0 그리고  100으로 나눈값이 0이 아닌것
    혹은 year 값을 40으로 나눈값이 0 인것은 res 값이 year + "년은 윤년" 으로 들어간다.
    그밖의 값은 else 문으로 들어가 res 값이 year + "년은 평년" 으로 들어간다.
    출력은 res값으로 출력된다.

     - 윤년은 해당연도를 4로 나눈값이 0임을 의미 그중 100으로 나눈 값이 0인것은 윤년에서 제외
     400으로 나눈 값이 0인것은 윤년으로 포함된다.그 외의 나머지 연도는 평년이다.
     - 출처 :https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=heartflow89&logNo=220966558486
     */

    }

    /**
     * author : sungsuhan
     * des :
     * Math.random()*최대값 + 최소값 => 최대값 최소값 사이의 랜덤수를 만든다 => int answer
     * int input => 넣는값 변수 생성
     * while 무한 loop 생성
     * input에 입력스캐너 달아준다
     * 만약 랜덤값이 입력값 보다 크다면 Up 출력
     * 그게 아니고 랜덤값이 입력값 보다 작다면 Down 출력
     * 둘 다 아니면 정답 출력
     *
     * 출처 : https://pridiot.tistory.com/36
     **/
    @Override
    public void numberGolf(Scanner scanner) {
        int answer = (int) (Math.random()*100 +1);
        int input;

        while (true) {
            System.out.println("1~100 사이 자연수 입력");
            input = scanner.nextInt();
            if (answer > input) {
                System.out.println("Up");
            } else if (answer < input) {
                System.out.println("Down");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }
}
