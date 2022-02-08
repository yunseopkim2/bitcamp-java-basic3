package com.example.basic.phone.controller;

import com.example.basic.phone.service.PhoneService;
import com.example.basic.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.basic.DemoController
 * fileName   : RfpController
 * author     : kimyunseop
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-08   yunseopkim        최초 생성
 */
public class PhoneController {
    public void execute(Scanner scanner) {

        PhoneService service = new PhoneServiceImpl();
        while(true){
            System.out.println("Menu\n" + "0.종료"+"1.집전화\n"+"2.휴대폰\n"+"3.아이폰\n"+"4.갤럭시노트폰");
            switch (scanner.next()){
                case "0" :
                    System.out.println("종료"); return;
                case  "1" :
                    System.out.println("집전화");
                    service.usePhone(scanner);break;
                case "2" :
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner);break;
                case "3":
                    System.out.println("아이폰");
                    service.useIPhone(scanner);break;
                case "4":
                    System.out.println("갤럭시노트폰");
                    service.useGalPhone(scanner);break;
                default:
                    System.out.println("잘못된 입력입니다.");break;


            }
        }

    }
}
