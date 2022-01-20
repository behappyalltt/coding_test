package com.devjenni.implementation;

import java.util.Scanner;

/*
    [왕실의 나이트]
    8 * 8 체스판에서 특정 위치에 있는 나이트가 움직일 수 있는 경우의 수 구하기
    단, 나이트는 두 가지 방법으로만 움직일 수 있음
    1. 수평으로 두 칸 이동 + 수직으로 한 칸 이동
    2. 수직으로 두 칸 이동 + 수평으로 한 칸 이동
 */
public class 왕실의나이트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dx[] = {2, 2, -2, -2, 1, -1, 1, -1};
        int dy[] = {1, -1, 1, -1, 2, 2, -2, -2};
        int cnt = 0;

        String row_column = sc.nextLine();
        int x = row_column.charAt(1);               // x좌표 구하기(숫자라 char to int 해서 바로 사용)
        int y = row_column.charAt(0) - 'a' + 1;     // y좌표 구하기(아스키코드를 이용하여)

        // 이동 가능한 경우의 수만큼 for문 돌리기
        for(int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>8 || ny>8 || nx<1 || ny<1) continue;

            cnt++;
        }

        System.out.println(cnt);
    }
}
