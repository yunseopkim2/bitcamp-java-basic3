package com.example.basic.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.basic.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : kimyunseop
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-10   yunseopkim        최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
    /*
     *    author     :
     * */
    @Override
    public void bubbleSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void insertionSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void selectionSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /*
     *    author     : 최민서
     * */
    @Override
    public void quickSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void mergeSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /*
     *    author     : 김승현
     * */
    @Override
    public void magicSquare(Scanner scanner) {
        int deg=0;

        while(true){
            {System.out.print("마방진의 홀수 차수를 입력하세요. : ");
                deg = scanner.nextInt();
                if(deg%2==1){}
                else if(deg%2==0){
                    System.out.println("홀수만 입력해야 합니다.");return;}
                else {System.out.println("숫자만 입력해야 합니다.");return;}
            }break;
        }
        /*
        풀이자: 김승현
        참조: https://dyndy.tistory.com/72
        위의내용 랜덤값 받는걸로 수정 예정

         */


        int array[][] = new int[deg][deg];
        int a = 1;
        int r = 0;
        int c = deg / 2;
        /*
        행 deg 열 deg 값을 갖는 이중배열 arry를 만든다.
        a r c 의 값을 각각 준다.
         */

        for(a = 1; a<= (deg*deg); a++){
            array[r][c] = a;
            if (a % deg == 0){
                r++;
            }
            /* for문 안의 a값은 1  부터 시작되며 a의값은 배열안에 들어가는 값이 되기에 최대 deg*deg까지이다.
             a를 deg로 나눈 나머지 값이 0이면 r값은 증가한다. 0이 아닌 다른값이 나오면  else문으로 이동한다.
             */
            else {
                r--;
                c--;
                if (r <0)
                    r = deg - 1;
                else if (c <0)
                    c = deg - 1;}
        }
        /*
        else문에서 r값과 c값은 감소하며 여기서 만약 r값이 0보다 작다면 r은 deg-1값이 된다. / r값이 0 보다 작지 않고
        c가 0보다 작을 때  c값은 deg-1 값이된다.
        */
        System.out.println(array[deg][deg]);
/*
        for(int i=0; i<deg; i++){
            for(int j=0; j<deg; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();       }

 */
    }

    /*
     *    author     : 김윤섭
     * http://ontheinfo.com/2241
     * */
    @Override
    public void zigzag() {
        Random random = new Random();
        int a = random.nextInt(10);
        int[][] number = new int[a][a];
        int count = 1;

        for (int i = 0; i < a; i++) {
            // number[0][],[1][],[2][]까지 수행됨
            if ((i % 2) == 0) {
                //2의배수 일때 = 짝수일때

                for (int j = 0; j < a; j++) {
                    // ---> 방향으로 진행 배열[i][a-1] 즉 3을 입력받으면 [0][0]~[0][2]까지
                    number[i][j] = count;
                    // count+=를 안하고 count++로 한 이유는 count+=으로 할 때는 number[0][0] = number[0][0]+count 임으로 계속해서 똑같은 count =1가 출력된다.
                    count++;
                }
            } else {
                //count의 숫자가 입력되는 진행 방향을 결정 i를 2로 나눠서 0일 아닐경우

                // 만약 i값이 1이라면
                for (int j = a - 1; j >= 0; j--) {
                    //[1][a-1] 즉 [1][2]~[1][0] 방까지

                    number[i][j] = count;
                    count++;
                    // count값을 증가시키면서 차례대로 방에 넣는다.
                }
            }

        }
        for (int k = 0; k < a ; k++) {
            //배열의 행에 해당
            for (int l = 0; l < a ; l++) {
                // 배열의 열에 해당
                System.out.print(number[k][l] + "\t");
                // 저장된 값을 차례대로 출력한다
            }
            System.out.println();
        }
    }


    /**
     * author : sungsuhan
     * des :
     * line 변수 생성 후 입력 스캐너 생성
     * 첫번째 for loop은 0부터 입력값 전까지 돌면서 몇 줄인지를 나타낸다
     * 만약 입력값 line 을 3이라 생각하자
     * 두번째 for loop은 i = 0 -> j=0 자리에 별 총 한개 출력
     *                  i = 1 -> j=0, j=1 자리에 별 총 두개 출력
     *                  i = 2 -> j=0, j=1, j=2 자리에 별 총 세개 출력
     **/
    @Override
    public void rectangleStarPrint(Scanner scanner) {
        int line;
        System.out.println("몇 줄 짜리 직각삼각형?");
        line = scanner.nextInt();
        for (int i=0; i<line; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /**
     * author : sungsuhan
     * des :
     * line 변수 생성 후 입력 스캐너 생성
     * 첫번째 for loop은 0부터 입력값 전까지 돌면서 몇 줄인지를 나타낸다
     * 만약 입력값 line 을 3이라 생각하자
     * 첫번째 for loop 속 첫번째 for loop은 i = 0 -> j=2, j=1 두번 공백 출력
     * i = 1 -> j=2 한번 공백 출력
     * i = 2 -> 공백없음
     * 첫번째 for loop 속 두번째 for loop은 i = 0 -> k=1 별 한번 출력
     * i = 1 -> k=1, k=2, k=3 별 세번 출력
     * i = 2 -> k=1, k=2, k=3, k=4, k=5 별 다섯번 출력
     * <p>
     * 출처 : https://coding-factory.tistory.com/68
     **/
    @Override
    public void triangleStarPrint(Scanner scanner) {
        int line;
        System.out.println("몇 줄 짜리 정삼각형?");
        line = scanner.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = line - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
