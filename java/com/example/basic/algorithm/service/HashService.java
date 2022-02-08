package com.example.basic.algorithm.service;

/**
 * packageName: com.example.basic.algorithm.service
 * fileName   : HashService
 * author     : kimyunseop
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-08   yunseopkim        최초 생성
 */
public interface HashService {
    public String falledPlayer(String[] participant, String[] completion);
    public boolean phoneBook(String[] phoneBook);
    public int spy(String[][] clothes);
    public int[] bestAlbum(String[] genres, int[] plays);
}
