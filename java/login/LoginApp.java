package login;
/**
 * packageName: login
 * fileName   : LoginApp
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : 아이디, 비밀번호, 이름을 받아 실행하는 앱
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class LoginApp {
    public static String LOGIN_APP = "로그인";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        //String res = "";
        /*
        if(pw.equals(PASSWORD)){
            res =String.format("%s님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
        }else {
            res =String.format("%s님의 비번 %s 가 틀립니다. 로그인 실패", this.name, this.pw);
            }*/
        /*switch (pw){
            case "abc" : res  =String.format("%s님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);break;
            default : res =String.format("%s님의 비번 %s 가 틀립니다. 로그인 실패", this.name, this.pw);break;
        }*/
        return (pw.equals(PASSWORD)) ? String.format("%s님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw)
                : String.format("%s님의 비번 %s 가 틀립니다. 로그인 실패", this.id , this.pw);
        // T,F  일 때만 사용가능하다. ?는3항이다. 메모리 사용하지 않는다.
        //return res; ?3항을 사용하면 리턴 값은 합쳐진다.

    }
}
