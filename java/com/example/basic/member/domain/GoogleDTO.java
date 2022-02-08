package com.example.basic.member.domain;

/**
 * packageName: google
 * fileName   : GoogleApp
 * author     : kimyunseop
 * date       : 2022-01-25
 * desc       : 구글 검색창에 검색할 수 있는 앱
 *  * variable
 *  * [클래스변수]: GOOGLE_APP
 *  * [인스턴스변수]: search
 *  * [파라미터]: search
 *  * [로컬변수]: res
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-25   yunseopkim        최초 생성
 */
public class GoogleDTO {
    public static String GOOGLE_APP = "GOOGLE";

    private String search;

    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }


}
