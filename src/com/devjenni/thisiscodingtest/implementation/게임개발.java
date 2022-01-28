package com.devjenni.thisiscodingtest.implementation;

import java.util.Scanner;

/*
    [게임 개발]
    N * M 맵
    현재 위치(x, y)와 방향(동서남북)을 입력 받음
    오로지 육지로만 이동이 가능하며, 갔던 곳을 다시 갈 수 없음
    1. 현재 위치에서 현재 방향을 기준으로 반시계 방향으로 90도 회전한 방향부터 갈 곳 정하기
    2. 바로 왼쪽에 가보지 않은 칸이 존재한다면, 왼쪽 방향으로 회전 후 한 칸 전진하고 다시 1단계로 돌아가기
    3. 네 방향 모두 이미 갔던 칸이거나 바다일 경우, 바라보는 방향을 유지하고 한 칸 뒤로 가기
    4. 만약 3단계 실행 중 뒤에 칸이 바다일 경우, 움직임 멈추기
 */
public class 게임개발 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 동서남북 각각 좌표 이동
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};

        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();   // 북(0), 동(1), 남(2), 서(3)

        int grounds[][] = new int[n][m];    // 육지(0), 바다(1)
        int steps[][] = new int[n][m];      // 갔던 위치를 확인하기 위한 배열
        steps[x][y] = 1;                    // 지금 있는 위치

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                grounds[i][j] = sc.nextInt();

                if(i!=n && j!=m) steps[i][j] = 0;
            }
        }

        int cnt = 0;
        int turn_time = 0;
        while (true) {
            // 왼쪽으로 회전
            d = turn_left(d);

            int nx = x + dx[d];
            int ny = y + dy[d];

            // 회전한 후 정면에 가보지 않은 칸이 존재하는 경우
            if(steps[nx][ny] == 0 && grounds[nx][ny] == 0) {
                cnt++;
                steps[nx][ny] = 1;
                x = nx;
                y = ny;
                turn_time = 0;
                continue;
            } else turn_time++;

            // 네 방향 모두 갈 수 없는 경우
            if(turn_time == 4) {
                nx = x - dx[d];
                ny = y - dy[d];

                // 뒤로 갈 수 있으면 뒤로 가기
                if(grounds[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    turn_time = 0;
                } else break;
            }
        }

        System.out.println(cnt);
    }

    // 왼쪽으로 회전
    public static int turn_left(int d) {
        d--;

        if(d == -1) return 3;
        else return d;
    }
}
