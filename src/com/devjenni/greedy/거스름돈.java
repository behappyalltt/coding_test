package com.devjenni.greedy;

public class 거스름돈 {
    public static void main(String[] args) {
        int money = 1260;
        int changes[] = {500, 100, 50, 10};
        int count = 0;

        for (int change:changes) {
            count += (money / change);
            money = money % change;
        }

        System.out.println("거스름 돈 개수: " + count);
    }
}
