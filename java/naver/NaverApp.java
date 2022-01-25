package naver;

/**
 * packageName: naver
 * fileName   : NaverApp
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : Naver에 로그인 후 환영하는 앱
 * variable
 * [클래스변수]: NAVER_APP
 * [인스턴스변수]: id, pw
 * [파라미터]: id, pw
 * [로컬변수]: res
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class NaverApp {
    public static String NAVER_APP = "NAVER";

    private String id;
    private String pw;

    public String naver(String id, String pw){
        this.id = id;
        this.pw = pw;
        String res = String.format("%s님 환영합니다.", this.id, this.pw);
        return res;


    }
}
