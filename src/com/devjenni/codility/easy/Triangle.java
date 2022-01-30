package com.devjenni.codility.easy;

import java.util.Arrays;

/*
    https://app.codility.com/demo/results/trainingFBA72S-4GU/
 */
public class Triangle {
    public static int triangleSolution(int[] A) {
        Arrays.sort(A);

        for(int i=0; i<A.length-2; i++) {
            if (A[i] + A[i+1] > A[i+2]
                && A[i+1] + A[i+2] > A[i]
                && A[i+2] + A[i] > A[i+1]) return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, 5, 1, 8, 20};

        System.out.println(triangleSolution(arr));
    }
}
