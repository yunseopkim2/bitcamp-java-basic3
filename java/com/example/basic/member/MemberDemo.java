package com.example.basic.member;

import java.util.Scanner;

/**
 * packageName: member
 * fileName   : MemberDemo
 * author     : kimyunseop
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-26   yunseopkim        최초 생성
 */
public class MemberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberApp memberApp = new MemberApp();
        String grade = memberApp.getMember();
        System.out.println(grade);
    }

}
