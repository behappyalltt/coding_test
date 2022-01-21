package com.devjenni.dfs_bfs;

/*
    [재귀 함수]
    자기 자신을 호출하는 함수
    break를 걸지 않으면 무한하게 실행되어 에러가 발생
    재귀적 구현과 반복적 구현의 차이ver
 */
public class 재귀함수03 {
    public static void main(String[] args) {
        System.out.println("재귀적으로 구현:" + factorialRecursive(5));
        System.out.println("반복적으로 구현:" + factorialIterative(5));
    }

    // 재귀적
    public static int factorialRecursive(int n) {
        if(n<=1) return 1;
        return n * factorialRecursive(n-1);
    }

    // 반복적
    public static int factorialIterative(int n) {
        int result = 1;
        for(int i=1; i<=n; i++) result *= i;

        return result;
    }
}
