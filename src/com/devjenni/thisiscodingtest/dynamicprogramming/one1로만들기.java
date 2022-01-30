package com.devjenni.thisiscodingtest.dynamicprogramming;

import java.util.Scanner;

/*
    [1로 만들기]
    연산 4개를 적절하게 사용해서 1 만들기
    1. X가 5로 나누어 떨어지면, 5로 나눈다
    2. X가 3로 나누어 떨어지면, 3로 나눈다
    3. X가 2로 나누어 떨어지면, 2로 나눈다
    4. X에서 1을 뺀다
 */
public class one1로만들기 {
    public static int[] d = new int[30001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for(int i=2; i<=x; i++) {
            d[i] = d[i-1] + 1;
            if(i % 2 == 0) d[i] = Math.min(d[i], d[i/2]+1);
            if(i % 3 == 0) d[i] = Math.min(d[i], d[i/3]+1);
            if(i % 5 == 0) d[i] = Math.min(d[i], d[i/5]+1);
        }

        System.out.println(d[x]);
    }
}
