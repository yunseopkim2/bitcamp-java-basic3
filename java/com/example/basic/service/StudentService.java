package com.example.basic.service;

import com.example.basic.domain.*;

/**
 * packageName: com.example.basic.service
 * fileName   : StudentService
 * author     : kimyunseop
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-07   yunseopkim        최초 생성
 */
public interface StudentService {
    String getBmi( BmiDTO bmi);
    String getCalc(CaclDTO calc);
    String getGoogle(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String getLogin(LoginDTO login);
}
