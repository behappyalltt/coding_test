package com.devjenni.thisiscodingtest.search;

import java.util.Arrays;
import java.util.Scanner;

/*
    [부품 찾기]
    n개의 부품이 있음
    손님은 m개 종류의 부품을 구입하려고 함
    구입 가능한지 yes/no
 */
public class 부품찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arrN[] = new int[n];
        for(int i=0; i<n; i++) arrN[i] = sc.nextInt();

        int m = sc.nextInt();
        int arrM[] = new int[m];
        for(int i=0; i<m; i++) arrM[i] = sc.nextInt();

        Arrays.sort(arrN);
        for(int i=0; i<m; i++) {
            System.out.print(binarySearch(arrN, arrM[i], 0, arrN.length-1) + " ");
        }
    }

    public static String binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) return "no";

        int idx = (start + end) / 2;
        if(arr[idx] == target) return "yes";
        else if(arr[idx] > target) return binarySearch(arr, target, start, idx-1);
        else return binarySearch(arr, target, idx+1, end);
    }
}
