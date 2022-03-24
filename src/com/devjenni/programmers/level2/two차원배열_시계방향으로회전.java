package com.devjenni.programmers.level2;

public class two차원배열_시계방향으로회전 {
    public static int[][] solution(int[][] matrix, int r) {
        r = r%4;

        for(int i=0; i<r; i++) {
            matrix = rotation(matrix);
        }

        return matrix;
    }

    public static int[][] rotation(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = matrix[n-j-1][i];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        solution(matrix, 1);
        solution(matrix, 2);
    }
}
