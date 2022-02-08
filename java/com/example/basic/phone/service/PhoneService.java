package com.example.basic.phone.service;

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
    void usePhone(Scanner scanner);
    void useCelPhone(Scanner scanner);
    void useIPhone(Scanner scanner);
    void useGalPhone(Scanner scanner);
}

