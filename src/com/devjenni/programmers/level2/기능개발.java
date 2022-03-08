package com.devjenni.programmers.level2;

import java.util.*;

/*
    [기능개발] - 스택/큐
    프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
    또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
    이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

    먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때,
    각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

    progresses	                speeds	                return
    [93, 30, 55]	            [1, 30, 5]	            [2, 1]
    [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]      [1, 3, 2]

    전화번호부에 적힌 전화번호를 담은 배열 phone_book이 solution 함수의 매개변수로 주어질 때,
    어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

    제한사항
    1. 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
    2. 작업 진도는 100 미만의 자연수입니다.
    3. 작업 속도는 100 이하의 자연수입니다.
    4. 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정.
       예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 */
public class 기능개발 {
    public static int[] solution_(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        Stack<Integer> result = new Stack<>();

        for(int i=0; i<progresses.length; i++) {
            int n = (100 - progresses[i]) / speeds[i];
            int m = (100 - progresses[i]) % speeds[i];

            if(m > 0) n++;
            day[i] = n;
            System.out.println("A " + day[i]);
        }

        int temp = day[0];
        int cnt = 1;
        for(int i=1; i<progresses.length; i++) {
            if(temp > day[i]) cnt++;
            else {
                System.out.println("B " + cnt);
                result.push(cnt);
                temp = day[i];
                cnt = 1;
            }
        }

        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i=0; i<answer.length; i++) answer[i] = result.get(i);

        return answer;
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int progresses1[] = {93, 30, 55};
        int progresses2[] = {95, 90, 99, 99, 80, 99};
        int speeds1[] = {1, 30, 5};
        int speeds2[] = {1, 1, 1, 1, 1, 1};

        solution(progresses1, speeds1);
        solution(progresses2, speeds2);
    }
}
