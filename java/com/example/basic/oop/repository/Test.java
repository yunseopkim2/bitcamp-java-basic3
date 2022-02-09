package com.example.basic.oop.repository;

import java.util.Scanner;

/**
 * packageName: com.example.basic.phone.repository
 * fileName   : Test
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰" , "검정" , 10);
        System.out.println("모델 :" + dmbCellPhone.model);
        System.out.println("색상 :" + dmbCellPhone.color);
        System.out.println("채널 :" + dmbCellPhone.channel);
        dmbCellPhone.powerON();
        dmbCellPhone.bell();


            dmbCellPhone.sendVoice(scanner.next());
            dmbCellPhone.receiveVoice(scanner.next());
            dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(scanner.nextInt());
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.powerOff();

    }
}
