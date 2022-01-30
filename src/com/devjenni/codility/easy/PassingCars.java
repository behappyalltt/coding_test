package com.devjenni.codility.easy;

/*
    https://app.codility.com/demo/results/trainingB7RW27-XAA/
 */
public class PassingCars {
    public static int passingCarsSolution(int[] A) {
        int zeroCnt = 0;
        int sum = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) zeroCnt++;
            else {
                sum += zeroCnt * A[i];
                if(sum > 1000000000) return -1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1};

        System.out.println(passingCarsSolution(arr));
    }
}
