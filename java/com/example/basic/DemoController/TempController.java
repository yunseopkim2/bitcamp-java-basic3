package com.example.basic.DemoController;

import com.example.basic.domain.GradeDTO;

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
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] oneNames = {"김윤섭", "최민서", "김승현", "한성수"};
        String[] oneSubject = { "스택", "해시", "정렬", "힙",
                                "큐", "그래프", "이분탐색법" ,"깊이우선탐색",
                                "DP", "탐욕법", "완전탐색법", "너비우선탐색"};

         for(int i = 0; i< oneNames.length; i++){
             System.out.println(oneNames[i]+ " : "
                     + oneSubject[i] + " , "
                     + oneSubject[i+4] + " , "
                     + oneSubject[i+8]);

         }

    }
}
