package com.example.basic.oop2.domain;

/**
 * packageName: com.example.basic.oop2.domain
 * fileName   : IPhone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class IPhone {
    public final static String KIND ="아이폰";
    protected String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "search='" + search + '\'' +
                '}';
    }
}
