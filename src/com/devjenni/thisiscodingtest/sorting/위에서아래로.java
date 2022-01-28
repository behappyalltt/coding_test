package com.devjenni.thisiscodingtest.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
    [위에서 아래로]
    수열을 내림차순으로 정렬
 */
public class 위에서아래로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer arr[] = new Integer[n];     // int는 Collections.reverseOrder를 지원하지 않음
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    }
}
