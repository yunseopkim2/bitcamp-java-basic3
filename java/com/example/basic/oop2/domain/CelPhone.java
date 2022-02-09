package com.example.basic.oop2.domain;

/**
 * packageName: com.example.basic.oop2.domain
 * fileName   : CelPhone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class CelPhone {
    protected String move;

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 통화한다.");
    }
}
