package com.devjenni.programmers.level1;

import java.util.HashMap;

/*
    [완주하지 못한 선수] - 해시
    수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    1. 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    2. completion의 길이는 participant의 길이보다 1 작습니다.
    3. 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    4. 참가자 중에는 동명이인이 있을 수 있습니다.
 */
class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        // 해시맵에 마라톤 선수 이름, 숫자1 put
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        // 마라톤 선수 이름이 value인 해시맵을 비교하여 이름이 있으면 위에서 입력했던 1에 -1(0으로 만든다)
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }

        // key값이 0이 아닌 선수 이름
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String participant[] = {"leo", "kiki", "eden"};
        String completion[] = {"leo", "eden"};

        System.out.println(solution(participant, completion));
    }
}