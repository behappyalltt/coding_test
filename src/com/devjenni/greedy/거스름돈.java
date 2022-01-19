package com.devjenni.greedy;

/*
    [거스름돈]
    거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재
    손님에게 거슬러 줘야 할 돈 N(10의 배수)원
    동전의 최소 개수 구하기
 */
public class 거스름돈 {
    public static void main(String[] args) {
        int money = 1260;
        int changes[] = {500, 100, 50, 10};
        int count = 0;

        // 동전 종류만큼 for문 돌리기
        for (int change:changes) {
            count += (money / change);
            money = money % change;
        }

        System.out.println("거스름 돈 개수: " + count);
    }
}
