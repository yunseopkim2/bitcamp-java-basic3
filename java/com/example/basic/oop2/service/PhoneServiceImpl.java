package com.example.basic.oop2.service;

import com.example.basic.oop.domain.CelPhone;
import com.example.basic.oop.domain.GalPhone;
import com.example.basic.oop.domain.IPhone;
import com.example.basic.oop.domain.Phone;

/**
 * packageName: com.example.basic.oop2.service
 * fileName   : PhoneServiceImpl
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());

    }
}
