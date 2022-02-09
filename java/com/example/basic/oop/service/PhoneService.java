package com.example.basic.oop.service;

import com.example.basic.oop.domain.CelPhone;
import com.example.basic.oop.domain.GalPhone;
import com.example.basic.oop.domain.IPhone;
import com.example.basic.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.basic.service
 * fileName   : PhoneService
 * author     : kimyunseop
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-08   yunseopkim        최초 생성
 */
public interface PhoneService{
    void usePhone(Phone phone);
    void useCelPhone(CelPhone phone);
    void useIPhone(IPhone phone);
    void useGalPhone(GalPhone phone);
}

