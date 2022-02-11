package com.example.basic.member.controller;

import com.example.basic.member.service.MemberService;
import com.example.basic.member.service.MemberServiceImpl;
import com.example.basic.member.domain.BmiDTO;
import com.example.basic.member.domain.CalcDTO;
import com.example.basic.member.domain.GoogleDTO;
import com.example.basic.member.domain.GradeDTO;
import com.example.basic.member.domain.UserDTO;

import java.util.Scanner;

/**
 * packageName: com.example.basic.controller
 * fileName   : DemoController
 * author     : kimyunseop
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-27   yunseopkim        최초 생성
 */
public class MemberController {
    public void execute(Scanner scanner) {
        MemberService Service = new MemberServiceImpl();

        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();


        while(true) {
            System.out.println("메뉴 선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1":
                    System.out.println(BmiDTO.BMI_APP +"\n이름, 키, 몸무게");
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setTall(scanner.nextInt());
                    b.setWeight(scanner.nextInt());
                    res = Service .getBmi(b);break;
                case "2":
                    System.out.println(CalcDTO.CALC_TITLE +"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = Service .getCalc(calc);break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE_APP +"\n검색");
                    google.setSearch(scanner.next());
                    res = Service .getGoogle(google);break;
                case "4":
                    System.out.println("학생 수는 몇명입니까?");
                    GradeDTO a = GradeDTO.getInstance();
                    a.setCount(scanner.nextInt());
                    System.out.println(GradeDTO.GRADE_TITLE +"\n이름, 국어, 영어, 수학");
                    a.setName(scanner.next());
                    a.setKor(scanner.nextInt());
                    a.setEng(scanner.nextInt());
                    a.setMath(scanner.nextInt());
                    res = Service .getGrade(a); break;
                case "5": System.out.println(UserDTO.LOGIN_APP +"\n아이디, 비번, 이름");
                UserDTO u = UserDTO.getInstance();
                u.setId(scanner.next());
                u.setPw(scanner.next());
                u.setName(scanner.next());
                    res = Service .getLogin(u);break;
                default:
                    System.out.println("잘못된 입력입니다.") ; break;
            }
            System.out.println(res);
        }
    }
}


 /* if(select.equals("1")){
            res = "BMI";
        }else if(select.equals("2")){
            res = "CALC";
        }else if(select.equals("3")){
            res = "SEARCH";
        }else if(select.equals("4")){
            res = "GRADE";
        }else if(select.equals("5")){
            res = "LOGIN";

       */
