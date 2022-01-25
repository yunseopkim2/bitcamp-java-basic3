package bmi;

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
public class BmiAPP {
    public static String BMI_APP = "BMI";

    private String 이름;
    private Double num1;
    private Double num2;

    public String Bmi(String 이름, Double num1, Double num2){
        this.이름 = 이름;
        this.num1 = 0.0;
        this.num2 = 0.0;

        String res = String.format(" %s님 정상입니다.", this.이름, this.num1, this.num2);
        return res;
    }
}
