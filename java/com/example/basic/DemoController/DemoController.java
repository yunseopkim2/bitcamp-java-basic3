package com.example.basic.DemoController;

import com.example.basic.domain.BmiDTO;
import com.example.basic.service.BmiService;
import com.example.basic.domain.CaclDTO;
import com.example.basic.service.CalcService;
import com.example.basic.domain.GoogleDTO;
import com.example.basic.service.GoogleService;
import com.example.basic.domain.GradeDTO;
import com.example.basic.service.GradeService;
import com.example.basic.domain.LoginDTO;
import com.example.basic.service.LoginService;

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
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        CaclDTO calc = new CaclDTO();
        CalcService calcService = new CalcService();
        GoogleDTO google = new GoogleDTO();
        GoogleService googleService = new GoogleService();
        GradeDTO grade = new GradeDTO();
        GradeService gradeService = new GradeService();
        LoginDTO login = new LoginDTO();
        LoginService loginService = new LoginService();
        while(true) {
            System.out.println("메뉴 선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1":
                    System.out.println(BmiDTO.BMI_APP +"\n이름, 몸무게, 키");
                    bmi.setName(scanner.next());
                    bmi.setNum1(scanner.nextInt());
                    bmi.setNum2(scanner.nextInt());
                    res = bmiService.getBmi(bmi);break;
                case "2":
                    System.out.println(CaclDTO.CALC_APP +"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE_APP +"\n검색");
                    google.setSearch(scanner.next());
                    res = googleService.getGoogle(google);break;
                case "4":
                    System.out.println("학생 수는 몇명입니까?");
                    grade.setCount(scanner.nextInt());
                    System.out.println(GradeDTO.GRADE_TITLE +"\n이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getGrade(grade); break;
                case "5": System.out.println(LoginDTO.LOGIN_APP +"\n아이디, 비번, 이름");
                login.setId(scanner.next());
                login.setPw(scanner.next());
                login.setName(scanner.next());
                    res = loginService.getLogin(login);break;
                default: res = "잘못된 입력입니다."; break;
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
