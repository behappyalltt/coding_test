package com.devjenni.codility.easy;

/*
    https://app.codility.com/demo/results/training2SX4TY-P5V/
 */
public class FrogJmp {
    public static int frogJmpSolution(int X, int Y, int D) {
        int jmpCnt = ((Y - X) / D);
        if(((Y - X) % D) > 0) jmpCnt += 1;

        return jmpCnt;
    }

    public static void main(String[] args) {
        System.out.println(frogJmpSolution(10, 85, 30));
    }
}
