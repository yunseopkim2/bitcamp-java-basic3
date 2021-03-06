package com.example.basic.oop2.domain;

/**
 * packageName: com.example.basic.oop2.domain
 * fileName   : Phone
 * author     : kimyunseop
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-09   yunseopkim        최초 생성
 */
public class Phone {
    protected String kind;
    protected String company;
    protected String call;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "kind='" + kind + '\'' +
                ", company='" + company + '\'' +
                ", call='" + call + '\'' +
                '}';
    }
}
