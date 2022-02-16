package com.example.basic.quiz.controller;

import com.example.basic.quiz.service.*;


import java.util.Scanner;

/**
 * packageName: com.example.basic.DemoController
 * fileName   : TempController
 * author     : kimyunseop
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-03   yunseopkim        최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner){
        Feb6Service feb6Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();

        while(true) {
            System.out.println("0.Exit 1)2월6일 2)2월7일 3)2월8일 4)2월10일");
            switch (scanner.next()) {
                case "0":
                    System.out.println("### Exit ###");return;
                case "1":
                    System.out.println("2월6일");
                    String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                            "정렬", "스택", "해시", "힙", "탐욕법",
                            "이분탐색", "큐", "그래프", "깊이우선탐색", "너비우선탐색",
                            "완전탐색", "DP"};
                    System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("### 1.팀별 과제 ###");
                            feb6Service.quiz1(arr);
                            break;
                        case "2":
                            System.out.println("### 2.팀장이 맡은 과제 ###");
                            feb6Service.quiz2(arr);break;
                        case "3":
                            System.out.println("### 3.큐를 담당한 사람 ###");
                            feb6Service.quiz3(arr);break;
                        case "4":
                            System.out.println("### 4.팀원별 과제 수 ###");
                            feb6Service.quiz4(arr);break;
                        default:
                            System.out.println("Wrong Number");break;
                    }

                case "2":
                    System.out.println("2월7일");
                    System.out.println("[소메뉴]\n 0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기\n 4.윤년/평년\n 5.임의숫자 맞추기");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 종료 ###");return;
                        case "1":
                            System.out.println("### 1.주사위 ###");
                            feb07Service.dice(scanner);break;
                        case "2":
                            System.out.println("### 2.가위바위보 ###");
                            feb07Service.rps(scanner);break;
                        case  "3":
                            System.out.println("### 3.소수 구하기 ###");
                            feb07Service.getPrime(scanner);break;
                        case  "4":
                            System.out.println("### 4.윤년/평년 ###");
                            feb07Service.leapYear(scanner);break;
                        case  "5":
                            System.out.println("### 5.임의숫자 맞추기 ###");
                            feb07Service.numberGolf(scanner);break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                    break;
                case "3":
                    System.out.println("2월8일");
                    System.out.println("[소메뉴]\n 0.Exit 1.로또 2.야구 3.좌석예약 4.은행 입출금 5.구구단");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 종료 ###");return;
                        case "1":
                            System.out.println("### 1.로또 ###");
                            feb08Service.lotto(scanner);break;
                        case "2":
                            System.out.println("### 2.야구 ###");
                            feb08Service.baseball(scanner);break;
                        case  "3":
                            System.out.println("### 3.좌석예약 ###");
                            feb08Service.booking(scanner);break;
                        case  "4":
                            System.out.println("### 4.은행 입출금 ###");
                            feb08Service.bank(scanner);break;
                        case  "5":
                            System.out.println("### 5.구구단 ###");
                            feb08Service.gugudan(scanner);break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                    break;

                case "4":
                    System.out.println("2월10일");
                    System.out.println("[소메뉴]\n 0.Exit 1.bubbleSort 2.insertionSort " +
                            "3.selectionSort 4.quickSort 5.mergeSort 6.magicSquare 7.zigzag 8.rectangleStarPrint 9.triangleStarPrint");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 종료 ###");return;
                        case "1":
                            System.out.println("### 1.bubbleSort ###");
                            feb10Service.bubbleSort(scanner);break;
                        case "2":
                            System.out.println("### 2.insertionSort ###");
                            feb10Service.insertionSort(scanner);break;
                        case "3":
                            System.out.println("### 3.selectionSort ###");
                            feb10Service.selectionSort(scanner);break;
                        case "4":
                            System.out.println("### 4.quickSort ###");
                            int[] arr1 = new int[10];

                            for (int i=0; i<arr1.length; i++) {
                                arr1[i]= (int)(Math.random()*100)+1;
                                for (int j=0; j<i; j++) {
                                    if (arr1[i]==arr1[j]) {
                                        i--; break;
                                    }
                                }
                            }
                            feb10Service.quickSort(arr1,0,arr1.length-1);
                            feb10Service.res(arr1);break;
                        case "5":
                            System.out.println("### 5.mergeSort ###");
                            int[] a = new int[10];
                            feb10Service.mergeSort(a);break;
                        case  "6":
                            System.out.println("### 6.magicSquare ###");
                            feb10Service.magicSquare(scanner);break;
                        case  "7":
                            System.out.println("### 7.zigzag ###");
                            feb10Service.zigzag();break;
                        case  "8":
                            System.out.println("### 8.rectangleStarPrint ###");
                            feb10Service.rectangleStarPrint(scanner);break;
                        case  "9":
                            System.out.println("### 9.triangleStarPrint ###");
                            feb10Service.triangleStarPrint(scanner);break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }

                default: System.out.println("잘못된 입력입니다.");break;

            }
        }
    }

}