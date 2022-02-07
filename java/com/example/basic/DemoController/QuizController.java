package com.example.basic.DemoController;

import java.util.Scanner;

/**
 * packageName: com.example.basic.DemoController
 * fileName   : TempController
 * author     : kimyunseop
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-03   yunseopkim        최초 생성
 */
public class QuizController {
    public static void main(String[] args) {

        String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "정렬", "스택",   "해시",     "힙", "탐욕법",
                "이분탐색", "큐", "그래프", "깊이우선탐색", "너비우선탐색",
                "완전탐색", "DP"};
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("메뉴선택");
        String menu = "0.Exit 1.Quiz1 2.Quiz2 3.Quiz3 4.Quiz4 5.Quiz5";
        System.out.println(menu);

        switch (scanner.next()){
            case "0" :
                System.out.println("시스템 종료"); return;
            case "1" : quiz1(arr); break;
            case "2" : quiz2(arr); break;
            case "3" : quiz3(arr); break;
            case "4" : quiz4(arr); break;
            case "5" : quiz5(arr); break;
            default: System.out.println("잘못된 입력입니다.");break;
        }
    }





    }

    private static void quiz5(String[] arr) {
        String s;
        s="";
        System.out.println("Q5. 팀원별 과제 수를 출력하세요. 예)김승현(3개) 김윤섭(3개) 최민서(2개) 한성수(2개) 김태욱(2개)");
        int count = 0;
        String countManager = "";
        countManager += arr[1] + "(3개)";
        countManager += arr[2] + "(2개)";
        countManager += arr[3] + "(2개)";
        countManager += arr[4] + "(2개)";
        countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(arr[5])){count0++;}
            if(arr[i].equals(arr[6])){count1++;}
            if(arr[i].equals(arr[7])){count2++;}
            if(arr[i].equals(arr[8])){count3++;}
            if(arr[i].equals(arr[9])){count4++;}

            countManager += arr[i] + "(3개),\n";
        }
        System.out.println(arr[0]+"의 카운터는"+count0);
        System.out.println(arr[1]+"의 카운터는"+count1);
        System.out.println(arr[2]+"의 카운터는"+count2);
        System.out.println(arr[3]+"의 카운터는"+count3);
        System.out.println(arr[4]+"의 카운터는"+count4);

        System.out.println(countManager);
    }

    private static void quiz4(String[] arr) {
        String s;
        s = "";
        System.out.println("Q4. 입력한 과목의 인덱스를 추출하세요.");
        String b = "그래프";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(b)){
                s= arr[i] + "의 담당자는"+ arr[i%5];
            }
        }
        System.out.println(s);
    }

    private static void quiz3(String[] arr) {
        String s;
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        String c = "큐" ;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(c)){
                s=arr[i] + " 담당한 사람 "+ arr[i%5];
            }
        }

        System.out.println(s);
    }

    private static void quiz2(String[] arr) {
        String s;
        s = "";
        System.out.println("Q2.팀장이 많은 과제만 출력하세요.");

        String b = "김윤섭";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(b)) {
                for (int j = 0; j < 4; j++) {
                    s += arr[i + j * 5] + ",";
                }
                if(i==18){break;}
            }

        }
        System.out.println(s);
    }

    private static void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요");


        String s = "";
        for (int i = 0; i < arr.length; i++) {

            if (i % 5 == 0) {s += "\n";}

              /* else if(i==10){s += "\n";}
                 else if(i==15){s += "\n";}*/

            s += i + ":" + arr[i] + "\t";




        }
        System.out.println(s);

    }

}