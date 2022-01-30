package com.devjenni.codility.medium;

/*
    https://cheolhojung.github.io/posts/algorithm/Codility-GenomicRangeQuery.html
 */
public class GenomicRangeQuery {
    public static int[] genomicRangeQuerySolution(String S, int[] P, int[] Q) {
        int arr[] = new int[P.length];
        for(int i=0; i<P.length; i++) {
            String str = S.substring(P[i], Q[i]+1);
            if(str.contains("A")) arr[i] = 1;
            else if(str.contains("C")) arr[i] = 2;
            else if(str.contains("G")) arr[i] = 3;
            else if(str.contains("T")) arr[i] = 4;
        }

        return arr;
    }

    public static void main(String[] args) {
        String s = "CAGCCTA";
        int p[] = {2, 5, 0};
        int q[] = {4, 5, 6};

        int arr[] = genomicRangeQuerySolution(s, p, q);
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + "");
    }
}
