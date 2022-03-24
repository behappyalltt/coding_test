package com.devjenni.programmers.level2;

/*
    주 5일제인 회사의 직원이 휴가를 내고 n일간 여행을 가려고 합니다.
    이 때 여행 기간에 포함되는 휴일(토요일과 일요일)의 숫자는 무슨 요일부터 여행을 시작하는지에 따라 달라질 수 있습니다.

    예를 들어 6일간 여행을 간다고 했을 때

    월요일부터 여행을 간다면 월-화-수-목-금-토로 휴일이 하루만 포함됩니다.
    화요일부터 여행을 간다면 화-수-목-금-토-일로 휴일이 이틀 포함됩니다.
    무슨 요일에 여행을 시작하더라도 휴일이 1보다 적게 포함되거나, 2보다 많이 포함될 수는 없습니다.
    여행을 가려는 기간 n일 주어질 때, 해당 기간중에 포함되는 휴일(토요일, 일요일)의 최솟값과 최댓값을 return 하도록 solution 함수를 완성해주세요.
 */
public class 휴일포함수 {
    public static long[] solution(long n)
    {
        long []answer = {0,0};

        if(n % 7 == 6) answer[0] = (n/7) * 2 + 1;
        else answer[0] = (n/7) * 2;

        if(n % 7 == 1) answer[1] = (n/7) * 2 + 1;
        else if(n % 7 == 0) answer[1] = (n/7) * 2;
        else answer[1] = ((n/7) + 1) * 2;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6)[0] + " " + solution(6)[1]);
        System.out.println(solution(7)[0] + " " + solution(7)[1]);
    }
}
