package com.example.basic.member.domain;

/**
 * packageName: bmi
 * fileName   : BmiAPP
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : 이름, 몸무게, 키를 작성하고 정상임을 확인시켜주는 앱
 * variable
 * [클래스변수]: NAVER_APP
 * [인스턴스변수]: 이름, num1, num2
 * [파라미터]: 이름, num1, num2
 * [로컬변수]: res
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class BmiDTO extends Object{
    public static String BMI_APP = "BMI";

    private String name;
    private double tall;
    private double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
