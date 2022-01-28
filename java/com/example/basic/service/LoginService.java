package com.example.basic.service;

import com.example.basic.domain.LoginDTO;

import static com.example.basic.domain.LoginDTO.PASSWORD;

/**
 * packageName: login
 * fileName   : LoginDemo
 * author     : kimyunseop
 * date       : 2022-01-24
 * desc       : LoginApp 을 받아 실행하는 컨트롤러
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-24   yunseopkim        최초 생성
 */
public class LoginService {
    public String getLogin(LoginDTO login){
        return (login.getPw().equals(PASSWORD)) ? String.format("%s님 환영합니다. 로그인 성공", login.getName())
                : String.format("%s님의 비번 %s 가 틀립니다. 로그인 실패", login.getId() , login.getPw());
    }
}
