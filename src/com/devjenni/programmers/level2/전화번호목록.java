package com.devjenni.programmers.level2;

import java.util.HashMap;

/*
    [전화번호 목록] - 해시
    전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
    전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

    구조대 : 119
    박준영 : 97 674 223
    지영석 : 11 9552 4421

    전화번호부에 적힌 전화번호를 담은 배열 phone_book이 solution 함수의 매개변수로 주어질 때,
    어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

    제한사항
    1. phone_book의 길이는 1 이상 1,000,000 이하입니다.
    2. 각 전화번호의 길이는 1 이상 20 이하입니다.
    3. 같은 전화번호가 중복해서 들어있지 않습니다.

 */
public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();

        // 해시에 핸드폰번호 저장
        for(String phone: phone_book) hm.put(phone, 0);

        for(int i=0; i<phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hm.containsKey(phone_book[i].substring(0, j))) return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String phone_book1[] = {"119", "97674223", "1195524421"};
        String phone_book2[] = {"123","456","789"};

        System.out.println(solution(phone_book1));
        System.out.println(solution(phone_book2));
    }
}
