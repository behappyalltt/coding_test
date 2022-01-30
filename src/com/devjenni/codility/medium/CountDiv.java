package com.devjenni.codility.medium;

/*
    https://app.codility.com/demo/results/training72YFM6-P44/
 */
public class CountDiv {
    public static int countDivSolution(int A, int B, int K) {
        if(A == 0) return B / K + 1;
        else return (B / K) - ((A-1) / K);
    }

    public static void main(String[] args) {
        System.out.println(countDivSolution(6, 11, 2));
        System.out.println(countDivSolution(11, 345, 17));
    }
}
