package com.example.basic.oop.domain;

/**
 * packageName: com.example.basic.phone.domain
 * fileName   : CelPhone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class CelPhone extends Phone{

    protected boolean potable;
    protected String move;

    public CelPhone(String kind, String company,String move ){
        super(kind, company);
        this.move = move;

    }

    public boolean isPotable() {
        return potable;
    }

    public void setPotable(boolean potable) {
        this.potable = potable;
    }

    public String getMove() {
        return move;
    }


    @Override
    public String toString() {
        return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 통화한다.",super.getKind(),
                super.getCompany(), super.getCall(),move);
    }
}
