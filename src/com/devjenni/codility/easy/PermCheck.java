package com.devjenni.codility.easy;

import java.util.HashSet;

public class PermCheck {
    public static int permCheckSolution(int[] A) {
        /*
        int sum = A.length * (A.length+1) / 2;
        int aSum = 0;
        for(int i=0; i<A.length; i++) aSum += A[i];

        if(sum == aSum) return 1;
        else return 0;
        */

        HashSet<Integer> permChk = new HashSet<>();

        for(int i=1; i<A.length+1; i++) permChk.add(i);
        for(int i=0; i<A.length; i++) permChk.remove(A[i]);

        if(permChk.isEmpty()) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        int arr1[] = {4, 1, 3, 2};
        int arr2[] = {4, 1, 5, 2};

        System.out.println(permCheckSolution(arr1));
        System.out.println(permCheckSolution(arr2));
    }
}
