package com.devjenni.implementation;

import java.util.Scanner;

/*
    [상하좌우]
    n * n 공간에서 이동 루트를 입력 받아 그 방법으로 이동한 뒤 최종 위치 구하기
    단, 시작 좌표는 항상 (1, 1)이며, 공간을 넘어갈 시 이동하지 않는다
 */
public class 상하좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dx[] = {0, 0, -1, 1};
        int dy[] = {-1, 1, 0, 0};
        String move_types[] = {"L", "R", "U", "D"};
        int x = 1;
        int y = 1;

        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");

        // plans만큼 for문 돌리기
        for(int i=0; i<plans.length; i++) {
            int nx = 0, ny = 0;     // x, y 좌표 미리 저장해두는 변수
            for(int j=0; j<4; j++) {
                if(plans[i].equals(move_types[j])) {    // move_types에 맞는 좌표 이동을 위한 if문
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            // 공간을 넘어갈 경우 무시
            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;

            x = nx;
            y = ny;
        }

        System.out.println(x + ", " + y);
    }
}
