package com.devjenni.dfs_bfs;

/*
    [재귀 함수]
    자기 자신을 호출하는 함수
    break를 걸지 않으면 무한하게 실행되어 에러가 발생
    100번만 실행되게 만든ver(에러 X)
 */
public class 재귀함수02 {
    public static void main(String[] args) {
        recursiveFunction(1);
    }

    public static void recursiveFunction(int i) {
        if(i==101) return;

        System.out.println("재귀 함수 호출" + i);
        recursiveFunction(i+1);
    }
}
