package com.devjenni.thisiscodingtest.search;

import java.util.Scanner;

/*
    [이진 탐색]
    찾으려는 데이터와 중간점 위치에 있는 데이터를 반복적으로 비교
    정렬되어 있는 상태에서만 가능
 */
public class 이진탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        else {
            System.out.println(result + 1);
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) return -1;

        int idx = (start + end) / 2;
        if(arr[idx] == target) return idx;
        else if(arr[idx] > target) return binarySearch(arr, target, start, idx-1);
        else return binarySearch(arr, target, idx+1, end);
    }
}
