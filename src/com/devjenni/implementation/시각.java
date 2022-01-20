package com.devjenni.implementation;

import java.util.Scanner;

/*
    [시각]
    0시 0분 0초부터 입력 받은 n시 59분 59초까지 3이 들어가는 시간이 몇 번인지 구하기
 */
public class 시각 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();
        
        for(int h=0; h<=n; h++) {   // 시
            for(int m=0; m<60; m++) {   //분
                for(int s=0; s<60; s++) {   // 초
                    if(check(h, m, s)) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    // 3 포함 여부 확인하는 함수
    public static boolean check(int h, int m, int s) {
        // h가 3일 때, m이 30~39일 때, m의 일의 자리가 3일 때, s가 30~39일 때, s의 일의 자리가 3일 때
        if(h%10==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3) return true;
        else return false;
    }
}
