package com.example.basic.oop2.domain;

/**
 * packageName: com.example.basic.oop2.domain
 * fileName   : GalPhone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class GalPhone {
    public final static String KIND = "갤럭시";
    private String pay;

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "GalPhone{" +
                "pay='" + pay + '\'' +
                '}';
    }
}
