package com.devjenni.codility.easy;

import java.util.HashSet;

/*
    https://app.codility.com/demo/results/training5KKDGB-EQ6/
 */
public class FrogRiverOne {
    public static int frogRiverOneSolution(int X, int[] A) {
        HashSet<Integer> leavesChk = new HashSet<>();

        for(int i=0; i<A.length; i++) {
            leavesChk.add(A[i]);
            if(leavesChk.size() == X) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int x = 5;
        int arr[] = {1, 3, 1, 4, 2, 3, 5, 4};

        System.out.println(frogRiverOneSolution(x, arr));
    }
}
