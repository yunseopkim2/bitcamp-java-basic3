package com.example.basic.DemoController;

import com.example.basic.service.QuizService;
import com.example.basic.service.QuizServiceImpl;

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
                "정렬", "스택", "해시", "힙", "탐욕법",
                "이분탐색", "큐", "그래프", "깊이우선탐색", "너비우선탐색",
                "완전탐색", "DP"};
        Scanner scanner = new Scanner(System.in);
        QuizService service = new QuizServiceImpl();

        while (true) {
            System.out.println("MENU\n"+ "0.Exit\n"+ "1.팀별 과제를 출력\n"+
                    "2.팀장이 맡은 과제만 출력\n"+
                    "3.큐를 담당한 사람을 출력\n"+
                    "4.입력한 과목의 인덱스를 출력\n"+
                    "5.팀원별 과제 수를 출력");

            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템 종료");
                    return;
                case "1":
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;
                case "5":
                    service.quiz5(arr);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }


    }

}