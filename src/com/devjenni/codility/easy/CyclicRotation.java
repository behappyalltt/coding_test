package com.devjenni.codility.easy;

/*
    https://app.codility.com/demo/results/training26CKWX-B2V/
 */
public class CyclicRotation {
    public static int[] cyclicRotationSolution(int[] A, int K) {
        int resultArray[] = new int[A.length];
        int length = A.length;

        for(int i=0; i<A.length; i++) {
            int idx = (K+i) % length;
            resultArray[idx] = A[i];
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int array[] = {3, 8, 9, 7, 6};
        int k = 3;
        cyclicRotationSolution(array, k);
    }
}
