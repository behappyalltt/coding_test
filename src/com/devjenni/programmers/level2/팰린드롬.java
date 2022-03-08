package com.devjenni.programmers.level2;

/*
    앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
    문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 완성해 주세요.

    예를들면, 문자열 s가 "abcdcba"이면 7을 return하고 "abacde"이면 3을 return합니다.

    제한사항
    1. 문자열 s의 길이 : 2,500 이하의 자연수
    2. 문자열 s는 알파벳 소문자로만 구성

    s	            answer
    "abcdcba"	    7
    "abacde"	    3
 */
public class 팰린드롬 {
    public static int solution(String s)
    {
        // 팰린드롬 최솟값이 1이기 때문에 return default값을 1로 설정
        int answer = 1;
        // Stirng -> char 배열로 변환
        char[] s_char = s.toCharArray();

        // 끝점(길이)
        for(int i=s.length(); i>=2; i--) {
            // 시작점
            for(int j=0; j+i <= s.length(); j++) {
                boolean check = true;

                for(int n=0; n<i/2; n++) {
                    // 시작과 끝에서부터 하나씩 증가, 감소한 위치에 있는 글자가 동일한지 체크
                    // 다를 경우 끝점을 변경하여 다시 실행
                    if(s_char[j+n] != s_char[i+j-n-1]) {
                        check = false;
                        break;
                    }
                }

                if(check) return i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdcba"));
        System.out.println(solution("abacde"));
    }
}
