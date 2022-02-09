package com.example.basic.oop.repository;

/**
 * packageName: com.example.basic.phone.repository
 * fileName   : CellPhone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class CellPhone {
    String model;
    String color;

    void powerON(){
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    void bell(){
        System.out.println("벨을 울립니다.");
    }
    void sendVoice(String message){
        System.out.println("자기: "+message);
    }
    void receiveVoice(String message){
        System.out.println("상대방: "+message);
    }
    void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
