package naver;

import java.util.Scanner;

/**
 * packageName: com.example.basic.controller
 * fileName   : DemoController2
 * author     : kimyunseop
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-27   yunseopkim        최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("menu 0.exit\n" +
                    "1.stick \t" +
                    "2.queue \t" +
                    "3.heap \n" +
                    "4.hash \t" +
                    "5.sort \n");
            switch (scanner.next()){
                case "0" : return;
                case "1" : break;
                default:
                    System.out.println("wrong");break;
            }
        }
    }
}
