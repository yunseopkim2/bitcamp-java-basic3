package com.example.basic.service;

import com.example.basic.domain.BmiDTO;

/**
 * packageName: bmi
 * fileName   : BmiDemo
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : BmiApp을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class BmiService {
    public String getBmi( BmiDTO bmi) {

        return String.format(" %s님 정상입니다.",bmi.getName());
    }

}
