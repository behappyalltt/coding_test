package com.devjenni.codility.easy;

import java.util.HashSet;

/*
    https://app.codility.com/demo/results/trainingGUN83B-G5F/
 */
public class Distinct {
    public static int distinctSolution(int[] A) {
        HashSet<Integer> dstct = new HashSet<>();
        for(int i=0; i<A.length; i++) dstct.add(A[i]);

        return dstct.size();
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 2, 3, 1};

        System.out.println(distinctSolution(arr));
    }
}
