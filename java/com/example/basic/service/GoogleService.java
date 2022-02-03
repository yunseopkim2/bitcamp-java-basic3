package com.example.basic.service;

import com.example.basic.domain.GoogleDTO;

/**
 * packageName: google
 * fileName   : GoogleDemo
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : 구글 검색 앱을 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class GoogleService {
    public String getGoogle(GoogleDTO google){
            return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());

        }
    }

