package com.devjenni.thisiscodingtest.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    [미로 탈출]
 */
public class 미로탈출 {
    public static int n, m;
    public static int[][] maze = new int[201][201];

    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            for(int j=0; j<m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0,0));
    }

    public static int bfs(int x, int y) {
        Queue<mazeNode> q = new LinkedList<>();
        q.offer(new mazeNode(x, y));

        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            mazeNode node = q.poll();
            x = node.getX();
            y = node.getY();

            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 공간을 벗어날 경우 무시
                if (nx<0 || nx>=n || ny<0 || ny>=m) continue;

                // 벽일 경우 무시
                if (maze[nx][ny] == 0) continue;

                // 해당 노드를 처음 방문할 경우 최단 거리 기록
                if (maze[nx][ny] == 1) {
                    maze[nx][ny] = maze[x][y] + 1;
                    q.offer(new mazeNode(nx, ny));
                }
            }
        }

        return maze[n - 1][m - 1];
    }
}

class mazeNode {
    private int x;
    private int y;

    public mazeNode(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;}

    public int getY() {
        return this.y;
    }
}