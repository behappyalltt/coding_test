package com.devjenni.thisiscodingtest.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
    [두 배열의 원소 교체]
    n개의 원소로 구성된 두 개의 배열
    최대 k번 바꿔치기 가능
    배열 A의 합이 가장 큰 경우를 만들어서 합 구하기
 */
public class 두배열의원소교체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arrA[] = new int[n];
        Integer arrB[] = new Integer[n];

        for(int i=0; i<n; i++) arrA[i] = sc.nextInt();
        for(int i=0; i<n; i++) arrB[i] = sc.nextInt();

        Arrays.sort(arrA);                                  // 오름차순
        Arrays.sort(arrB, Collections.reverseOrder());      // 내림차순

        for(int i=0; i<k; i++) {
            // 두 수를 비교
            if (arrA[i] < arrB[i]) {
                // 두 원소를 교체
                int temp = arrA[i];
                arrA[i] = arrB[i];
                arrB[i] = temp;
            } else break;
        }

        int sum = 0;
        for(int i=0; i<n; i++) sum += arrA[i];
        System.out.println(sum);
    }
}
