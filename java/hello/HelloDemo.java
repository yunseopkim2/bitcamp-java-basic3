package hello;

import java.util.Scanner;
/**
 * packageName: hello
 * fileName   : HelloDemo
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : HelloApp 을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println(helloApp.HELLO_TITLE);
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        System.out.println("Name");
        String name = scanner.next();
        String res = helloApp.hello(id, pw, name);
        System.out.println(res);
    }
}
