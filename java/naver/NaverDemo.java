package naver;

import java.util.Scanner;

/**
 * packageName: naver
 * fileName   : NaverDemo
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : NaverApp을 실행시키는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println(NaverApp.NAVER_APP);
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        String res = naverApp.naver(id, pw);
        System.out.println(res);
    }
}
