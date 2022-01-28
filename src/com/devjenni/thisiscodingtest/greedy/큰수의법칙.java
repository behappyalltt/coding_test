package com.devjenni.thisiscodingtest.greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
    [큰 수의 법칙]
    다양한 수로 이러어진 배열
    주어진 수들을 M번 더하여 가장 큰 수 만들기
    단, 배열의 특정 인덱스에 해당하는 수를 연속으로 K번을 초과하여 더할 수 없음
 */
public class 큰수의법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 숫자 n개
        int m = sc.nextInt();       // 총 m번
        int k = sc.nextInt();       // k번 반복 가능

        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);           // 정렬(오름차순)
        int first = arr[n-1];       // 가장 마지막 숫자(가장 큰 숫자)
        int second = arr[n-2];      // 뒤에서 두번째 숫자(두번째로 큰 숫자)
        
        // 반복 가능한 수 + 1(다음 반복을 위한 것)을 한 묶음이라고 생각하고 계산
        int first_cnt = (m/(k+1)*k) + m%(k+1);
        int second_cnt = m/(k+1);

        System.out.println(first*first_cnt + second*second_cnt);
    }
}
