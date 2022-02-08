package com.example.basic.algorithm.controller;

import com.example.basic.algorithm.service.SortService;

import java.util.Scanner;

/**
 * packageName: com.example.basic.algorithm.controller
 * fileName   : AlgorithmController
 * author     : kimyunseop
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-08   yunseopkim        최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner) {

        while (true) {
            System.out.println("[담당] 0.종료 1.김승현 2.김윤섭 3.최민서 4.한성수");
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("0.Exit 1.Sort 2.Binaray Search 3.Brute Force");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("Sort");

                        case "2":
                            System.out.println("Binaray Search");
                        case "3":
                            System.out.println("Brute Force");
                        default:
                            System.out.println("Wrong Number");break;


                    }
                case "2":
                    System.out.println("0.Exit 1.Stack 2.Queue 3.Dp");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                            case "1":
                            System.out.println("Stack");

                            case "2":
                                    System.out.println("Queue");
                                case "3":
                                    System.out.println("Dp");
                        default:
                            System.out.println("Wrong Number");break;



                                    }
                case "3" :
                    System.out.println("0.Exit 1.Hash 2.Graph 3.Greedy");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("Hash");

                        case "2":
                            System.out.println("Graph");
                        case "3":
                            System.out.println("Greedy");
                        default:
                            System.out.println("Wrong Number");break;



                    }

                case "4" :
                    System.out.println("0.Exit 1.Heap 2.Dfs 3.Bfs");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("Heap");

                        case "2":
                            System.out.println("Dfs");
                        case "3":
                            System.out.println("Bfs");
                        default:
                            System.out.println("Wrong Number");break;



                    }
                default:
                    System.out.println("Wrong Number");break;
                            }
                    }
            }
        }

