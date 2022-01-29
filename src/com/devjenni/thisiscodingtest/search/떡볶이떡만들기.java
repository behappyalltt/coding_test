package com.devjenni.thisiscodingtest.search;

import java.util.Scanner;

/*
    [떡볶이 떡 만들기]
    n개의 떡, 요청한 떡의 길이 m
    떡의 높이를 기준으로 잘라 남은 떡을 손님이 가져갈 수 있음
    적어도 m만큼의 떡을 가져갈 수 있기 위한 떡의 높이
 */
public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = 0;
        int start = 0;
        int end = (int) 1e9;

        while (start <= end) {
            int h = (start + end) / 2;
            int totalH = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > h) totalH += (arr[i] - h);
            }

            if(m > totalH) end = h-1;
            else {
                result = h;
                start = h+1;
            }
        }

        System.out.println(result);
    }
}
