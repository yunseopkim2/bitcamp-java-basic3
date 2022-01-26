package abc;

import java.util.Scanner;

/**
 * packageName: abc
 * fileName   : AbcDemo
 * author     : kimyunseop
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-26   yunseopkim        최초 생성
 */
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        String res = abcApp.getAbc();
        System.out.println(res);
    }

}
