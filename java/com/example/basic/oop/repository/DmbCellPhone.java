package com.example.basic.oop.repository;

/**
 * packageName: com.example.basic.phone.repository
 * fileName   : DmbCellPhone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class DmbCellPhone extends CellPhone{
    int channel;

    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
        void turnOnDmb(){
            System.out.println("채널" +channel + "번 DMB 방송 수신을 시작합니다.");
        }
        void changeChannelDmb(int channel){
        this.channel = channel;
            System.out.println("채널" + channel + "번으로 바꿉니다.");
        }
        void turnOffDmb(){
            System.out.println("DMB 방송 수신을 멈춥니다.");
        }

    }

