package com.devjenni.dfs_bfs;

/*
    [재귀 함수]
    자기 자신을 호출하는 함수
    break를 걸지 않으면 무한하게 실행되어 에러가 발생
    에러 발생ver
 */
public class 재귀함수01 {
    public static void main(String[] args) {
        recursiveFunction();
    }

    public static void recursiveFunction() {
        System.out.println("재귀 함수 호출");
        recursiveFunction();
    }
}
