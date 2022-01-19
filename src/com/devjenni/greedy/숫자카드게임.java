package com.devjenni.greedy;

import java.util.Scanner;

/*
    [숫자 카드 게임]
    행과 열이 각각 N과 M인 숫자 카드들
    뽑고자 하는 행 선택
    그 행에서 가장 수가 작은 카드를 선택
    이러한 조건들을 고려하여 가장 큰 수 뽑기
 */
public class 숫자카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 행의 개수
        int m = sc.nextInt();       // 열의 개수

        int arr[][] = new int[n][m];
        int min_data[] = new int[n];
        for(int i=0; i<n; i++) {
            int row_arr[] = new int[m];
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
                row_arr[j] = arr[i][j];

                // row_arr[j] = sc.nextInt();
            }
            min_data[i] = getMin(row_arr);
        }

        System.out.println(getMax(min_data));
    }

    // 최소값
    static int getMin(int arr[]) {
        int min = 10000;
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }

        return min;
    }

    // 최대값
    static int getMax(int arr[]) {
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }

        return max;
    }
}
