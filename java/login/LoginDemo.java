package login;

import java.util.Scanner;
/**
 * packageName: login
 * fileName   : LoginDemo
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : LoginApp 을 받아 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.LOGIN_APP);
        System.out.println("ID");
        String id = scanner.next();
        System.out.println("PW");
        String pw = scanner.next();
        System.out.println("Name");
        String name = scanner.next();
        String res = loginApp.login(id, pw, name);
        System.out.println("res");
    }
}
