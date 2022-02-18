package com.example.basic.quiz.service;

public class tem {
    public static void main(String[] args) {
        int a = (int)(Math.random()*3)+1;
        int b = (int)(Math.random()*3)+1;
        System.out.println(a);
        System.out.println(b);
        String s = "";
        if(a==b) s = "Draw";
        /**
         * 2%3 2 3
         * 3%3 0 1
         * 1%3 1 2
         * */
        else s = (b>(a%3)+1) ? "Win" : "Lose";
        System.out.println(s);
    }
}
