package com.devjenni.codility.easy;

import java.util.Arrays;

/*
    https://app.codility.com/demo/results/trainingXWQYV5-Q8U/
 */
public class MaxProductOfThree {
    public static int maxProductOfThreeSolution(int[] A) {
        Arrays.sort(A);
        int mtp = A[A.length-1];

        int mtp1 = A[0] * A[1];
        int mtp2 = A[A.length-2] * A[A.length-3];

        if(mtp1 > mtp2) mtp *= mtp1;
        else mtp *= mtp2;

        return mtp;
    }

    public static void main(String[] args) {
        int arr1[] = {-3, 1, 2, -2, 5, 6};
        int arr2[] = {-10, -9, 1, 2, -2, 5, 6};

        System.out.println(maxProductOfThreeSolution(arr1));
        System.out.println(maxProductOfThreeSolution(arr2));
    }
}
