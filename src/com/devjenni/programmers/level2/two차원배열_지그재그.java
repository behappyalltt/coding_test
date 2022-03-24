package com.devjenni.programmers.level2;

public class two차원배열_지그재그 {
    public static long solution(int n, int r, int c) {
        int max = n*n;
        int direction_check = 0;
        int x = 0;
        int y = -1;
        int cnt = 1;

        while(cnt <= max) {
            if(x == n-1 && cnt <= max) {
                y++;
                cnt++;
                direction_check = 1;

                if(coordinate_check(x, y, c, r)) break;
            }

            if(y == n-1 && cnt <= max) {
                x++;
                cnt++;
                direction_check = 0;

                if(coordinate_check(x, y, c, r)) break;
            }

            if(y == 0 && cnt <= max) {
                x++;
                cnt++;
                direction_check = 1;

                if(coordinate_check(x, y, c, r)) break;
            }

            if(x == 0 && cnt <= max) {
                y++;
                cnt++;
                direction_check = 0;

                if(coordinate_check(x, y, c, r)) break;
            }

            if(direction_check==0 && x!=n-1 && y!=0 && cnt <= max) {
                x++;
                y--;
                cnt++;

                if(coordinate_check(x, y, c, r)) break;
            }

            if(direction_check==1 && y!=n-1 && x!=0 && cnt <= max) {
                x--;
                y++;
                cnt++;

                if(coordinate_check(x, y, c, r)) break;
            }
        }

        return cnt-1;
    }

    public static boolean coordinate_check(int x, int y, int c, int r) {
        if(y==r-1 && x==c-1) return true;
        else return false;
    }

//    public static long solution(int n, int r, int c) {
//        int[][] arr = new int[n][n];
//        int max = n*n;
//        int direction_check = 0;
//        int x = 0;
//        int y = -1;
//        int cnt = 1;
//
//        while(cnt <= max) {
//            if(x == n-1 && cnt <= max) {
//                arr[++y][x] = cnt++;
//                direction_check = 1;
//            }
//
//            if(y == n-1 && cnt <= max) {
//                arr[y][++x] = cnt++;
//                direction_check = 0;
//            }
//
//            if(y == 0 && cnt <= max) {
//                arr[y][++x] = cnt++;
//                direction_check = 1;
//            }
//
//            if(x == 0 && cnt <= max) {
//                arr[++y][x] = cnt++;
//                direction_check = 0;
//            }
//
//            if(direction_check==0 && x!=n-1 && y!=0 && cnt <= max) arr[--y][++x] = cnt++;
//            if(direction_check==1 && y!=n-1 && x!=0 && cnt <= max) arr[++y][--x] = cnt++;
//
//            if(arr[r-1][c-1] != 0) break;
//        }
//
//        return arr[r-1][c-1];
//    }

    public static void main(String[] args) {
        System.out.println(solution(100, 100, 100));
        System.out.println(solution(6, 1, 2));
    }
}
