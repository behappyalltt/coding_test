package com.devjenni.programmers.level2;

/*
    자연수 num이 주어질 때, num보다 크거나 같은 자연수 중에서 다음 조건을 만족하는 가장 작은 수를 구하려 합니다.

    구하는 숫자의 자릿수는 짝수여야 합니다.
    숫자가 2 x n 자릿수 일 때, 앞 n 자리의 각 자릿수 곱과 뒤 n 자리의 각 자릿수 곱이 같아야 합니다.
    자연수 num이 매개변수로 주어질 때, num보다 크거나 같은 수 중에서 조건을 만족하는 가장 작은 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1. 1 ≤ num ≤ 50,000,000
    2. num은 자연수

    num	        return
    21	        22
    3462	    3462
    235386	    235516
 */
public class 자릿수짝수_앞뒤곱같음 {
    public static int solution(int num) {
        while(true) {
            // int -> char 배열로 변환
            char num_char[] = Integer.toString(num).toCharArray();

            // 숫자가 홀수자리수면 +1만 하고 넘어간다
            if(num_char.length % 2 == 1) {
                num++;
                continue;
            }

            int half = num_char.length / 2;
            int mul1 = 1;   // 앞자리의 곱
            int mul2 = 1;   // 뒷자리의 곱

            for(int i=0; i<num_char.length; i++) {
                // i가 앞자리일 경우 mul1에, 뒷자리일 경우 mul2에 곱해준다
                if(i < half) mul1 *= Character.getNumericValue(num_char[i]);
                else mul2 *= Character.getNumericValue(num_char[i]);
            }

            // mul1과 mul1가 같으면 그 숫자를 return
            if(mul1 == mul2) break;
            // mul1과 mul2가 다르면 +1하고 같은 과정을 반복
            num++;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(21));
        System.out.println(solution(3462));
        System.out.println(solution(235516));
    }
}
