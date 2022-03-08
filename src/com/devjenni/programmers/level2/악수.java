package com.devjenni.programmers.level2;

/*
    직사각형 모양의 테이블의 한쪽 변에 N명씩, 마주 보는 양변에 총 2 x N명의 사람이 일정한 간격으로 마주 보고 앉아있습니다.
    이 테이블에 앉아 있는 사람들끼리 회의를 시작하기 전에 악수하려고 합니다. 한 사람은 한 번에 한 명과 악수를 할 수 있으며,
    모든 악수는 동시에 이뤄집니다. 악수할 때는 모든 사람이 참여해야만 하고 악수하는 사람들의 팔이 교차 돼서는 안 되며,
    대각선 방향에 위치한 사람과도 악수해서는 안 됩니다. 즉, 악수할 때는 자신의 왼쪽, 오른쪽, 혹은 맞은편 사람과만 악수할 수 있습니다.
    아래는 N = 3인 경우의 예시입니다.

    N = 3일 때, 위 그림과 같이 직사각형 테이블의 양변에 각각 3명씩의 사람이 앉게 됩니다.
    이때, 모든 사람이 악수에 참여하면서, 팔이 교차하지 않도록 각각 자신의 오른쪽, 왼쪽, 혹은 맞은 편 사람과 악수를 하는 방법은 아래와 같이 3가지입니다.

    테이블의 한쪽 변에 앉아있는 회의에 참석하는 사람의 수 N이 매개변수로 주어질 때,
    2 x N 명의 사람이 동시에 악수를 하는 방법의 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1. N은 회의에 참석하는 사람 중 테이블의 한쪽 변에 앉아있는 사람의 수입니다.
    2. N은 1 이상 45 이하의 자연수입니다.

    N	result
    1	1
    2	2
    3	3
 */
public class 악수 {
    public static int solution(int N) {
        // 피보나치 수열을 응용해서 코드 작성함
        if(N <= 1) return 1;
        return solution(N-1) + solution(N-2);
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
}
