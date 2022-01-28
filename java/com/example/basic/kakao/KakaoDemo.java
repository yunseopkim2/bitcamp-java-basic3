package com.example.basic.kakao;

import java.util.Scanner;
/**
 * packageName: kakao
 * fileName   : KakaoDemo
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : 카카오앱을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(kakaoApp.KAKAO_TITLE);
        System.out.println("전화번호");
        String telno = scanner.next();
        System.out.println("메세지");
        String message = scanner.next();
        String res = kakaoApp.kakao(telno,message);
        System.out.println(res);
    }
}
