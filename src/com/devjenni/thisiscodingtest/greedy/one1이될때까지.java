package com.devjenni.thisiscodingtest.greedy;

import java.util.Scanner;

/*
    [1이 될 때까지]
    숫자 N이 1이 될 때까지 두 가지 과정 중 하나를 반복적으로 선택하여 수행
    1. N에서 1을 뺀다
    2. N을 K로 나눈다(단, N이 K로 나누어떨어질 때만 가능)
 */
public class one1이될때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 수
        int k = sc.nextInt();       // 나눌 수
        int count = 0;

        // n이 1이 될 때까지 while문 돌리기
        while(n > 1) {
            count++;                    // 총 몇번의 계산이 필요한지 count

            if(n%k == 0) n = n/k;       // n이 k의 배수일 경우 나누고
            else n = n-1;               // 아닐 경우 -1
        }

        System.out.println(count);
    }
}
