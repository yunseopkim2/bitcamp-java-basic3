package kakao;
/**
 * packageName: kakao
 * fileName   : KakaoApp
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : 전화번호와 메시지를 받아 실행하는 앱
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class KakaoApp {
    static String KAKAO_TITLE = "카카오톡";

String telno;
String message;

public String kakao(String telno, String message){
    this.telno = telno;
    this.message = message;
    return String.format(" 전화번호 : %s. 메시지 : %s", this.telno, this.message);
}
}
