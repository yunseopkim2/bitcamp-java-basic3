package google;

import java.util.Scanner;

/**
 * packageName: google
 * fileName   : GoogleDemo
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : 구글 검색 앱을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println(googleApp.GOOGLE_APP);
        System.out.println("Google 검색 또는 URL 입력");
        String search = scanner.next();
        String res = googleApp.google(search);
        System.out.println(res);


    }
}
