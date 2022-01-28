package com.example.basic.service;

import com.example.basic.domain.CaclDTO;

/**
 * packageName: calc
 * fileName   : CalcDemo
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : 4칙 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class CalcService {
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
}
