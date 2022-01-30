package com.devjenni.codility.medium;

import java.util.Arrays;

/*
    https://app.codility.com/demo/results/trainingN6AZNX-ZZK/
 */
public class MissingInteger {
    public static int missingIntegerSolution(int[] A) {
        Arrays.sort(A);
        for(int i=0; i<A.length; i++) System.out.print(A[i] + " ");
        System.out.println("");

        if(A[0] > 1) return 1;

        for(int i=0; i<A.length-1; i++) {
            if (A[i + 1] > 0 && A[i] > 0) {
                if (A[i + 1] - A[i] > 1) return A[i] + 1;
            } else if (A[i + 1] > 1 && A[i] < 0) return 1;
        }

        return A[A.length-1] > 0 ? A[A.length-1] + 1 : 1;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 6, 4, 1, 2};
        int arr2[] = {-5, -8 , 2};
        int arr3[] = {5, 4, 3, 8, -2};
        int arr4[] = {1, 2, 3};
        int arr5[] = {100, 101};

        System.out.println(missingIntegerSolution(arr1));
        System.out.println(missingIntegerSolution(arr2));
        System.out.println(missingIntegerSolution(arr3));
        System.out.println(missingIntegerSolution(arr4));
        System.out.println(missingIntegerSolution(arr5));
    }
}
