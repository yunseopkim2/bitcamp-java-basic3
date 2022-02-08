package com.example.basic.algorithm.service;

/**
 * packageName: com.example.basic.algorithm.service
 * fileName   : StackService
 * author     : kimyunseop
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-08   yunseopkim        최초 생성
 */
public interface StackService {
    int[] function(int[] progresses, int[] speeds);
    int printer(int[] priorities, int location);
    int truck(int bridge_length, int weight, int[] truck_weights);
    int[] stock(int[] prices);
}
