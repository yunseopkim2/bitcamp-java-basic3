package hello;
/**
 * packageName: hello
 * fileName   : HelloApp
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : 아이디, 비밀번호, 이름을 받아서 실행하는 앱
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class HelloApp {
    static  String HELLO_TITLE = "헬로우앱";
    String id;
    String pw;
    String name;

    public String hello(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return  String.format("ID : %s, PW : %s, Name : %s", this.id, this.pw, this.name);
    }
}
