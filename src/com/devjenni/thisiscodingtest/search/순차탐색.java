package com.devjenni.thisiscodingtest.search;

import java.util.Scanner;

/*
    [순차 탐색]
    리스트 안에 있는 특정한 데이터를 찾기 위해 앞에서부터 데이터를 하나씩 비교
 */
public class 순차탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
        int n = sc.nextInt();
        String target = sc.next();

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(sequentialSearch(n, target, arr) + "번째");
    }

    public static int sequentialSearch(int n, String target, String[] arr) {
        for(int i=0; i<n; i++) {
            if(arr[i].equals(target)) return i+1;
        }

        return -1;
    }
}
