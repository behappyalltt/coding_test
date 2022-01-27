package com.devjenni.codility.easy;

/*
    https://app.codility.com/demo/results/training7QEXVV-77H/
 */
public class PermMissingElem {
    public static int permMissingElemSolution(int[] A) {
        long sum = (long)(A.length+1) * (A.length+2) / 2 ;

        for(int i=0; i<A.length; i++) sum = sum - A[i];

        return (int)sum;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 5};
        System.out.println(permMissingElemSolution(array));
    }
}
