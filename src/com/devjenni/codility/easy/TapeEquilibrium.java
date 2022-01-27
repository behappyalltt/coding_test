package com.devjenni.codility.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    https://app.codility.com/demo/results/trainingF95HG3-NHK/
 */
public class TapeEquilibrium {
    public static int tapeEquilibriumSolution(int[] A) {
        List<Integer> sum = new ArrayList<>();
        int totalSum = 0;

        for(int i: A) totalSum += i;

        int left = 0;
        for(int i=1; i<A.length; i++) {
            left += A[i-1];
            int right = totalSum - left;
            sum.add(Math.abs(left-right));
        }

        return Collections.min(sum);
    }

    public static void main(String[] args) {
        int array[] = {3, 1, 2, 4, 3};
        System.out.println(tapeEquilibriumSolution(array));
    }
}
