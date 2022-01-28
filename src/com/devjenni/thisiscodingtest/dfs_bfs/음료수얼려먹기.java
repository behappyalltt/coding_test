package com.devjenni.thisiscodingtest.dfs_bfs;

import java.util.Scanner;

/*
    [음료수 얼려 먹기]
 */
public class 음료수얼려먹기 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        //int ices[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            for(int j=0; j<m; j++) {
                //ices[i][j] = sc.nextInt();
                //graph[i][j] = 0;

                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(dfs(i, j)) cnt++;
            }
        }

        System.out.println("\n" + cnt);
    }

    public static boolean dfs(int x, int y) {
        // 범위를 벗어날 경우 바로 종료
        if(x<=-1 || x>=n || y<=-1 || y>=m) return false;

        // 방문하지 않았다면
        if(graph[x][y] == 0) {
            graph[x][y] = 1;

            // 상, 하, 좌, 우 탐색
            dfs(x-1, y);
            dfs(x, y+1);
            dfs(x, y+1);
            dfs(x+1, y);

            return true;
        }

        return false;
    }
}
