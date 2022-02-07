package com.example.basic.service;

import com.example.basic.domain.*;

import static com.example.basic.domain.LoginDTO.PASSWORD;

/**
 * packageName: com.example.basic.service
 * fileName   : StudentServiceImpl
 * author     : kimyunseop
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-07   yunseopkim        최초 생성
 */
public class StudentServiceImpl implements StudentService{


    @Override
    public String getBmi(BmiDTO bmi) {
        return String.format(" %s님 정상입니다.",bmi.getName());
    }

    @Override
    public String getCalc(CaclDTO calc) {
        int res = 0;
        switch (calc.getOpcode()) {
            case "+":
                res = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                res = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                res = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                res = calc.getNum1() / calc.getNum2();
                break;
        }
        return String.format("%d %s %d = %d ", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);

    }

    @Override
    public String getGoogle(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";

        return String.format("* ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", GradeDTO.GRADE_TITLE,
                grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(),
                total,
                avg,
                pass);
    }

    @Override
    public String getLogin(LoginDTO login) {
        return (login.getPw().equals(PASSWORD)) ?
                String.format("%s님 환영합니다. 로그인 성공", login.getName())
                :
                String.format("%s님의 비번 %s 가 틀립니다. 로그인 실패", login.getId() , login.getPw());
    }
}
