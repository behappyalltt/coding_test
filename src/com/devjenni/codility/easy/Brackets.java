package com.devjenni.codility.easy;

import java.util.Stack;

/*
    https://app.codility.com/demo/results/trainingNWFUWC-M8X/
 */
public class Brackets {
    public static int bracketsSolution(String S) {
        Stack<Character> stk = new Stack<>();

        if(S == null || S.length() == 0) return 0;

        for(char c : S.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') stk.push(c);
            else {
                if(stk.isEmpty()) return 0;
                char last = stk.pop();

                if(last == '(' && c != ')') return 0;
                else if(last == '[' && c != ']') return 0;
                else if(last == '{' && c != '}') return 0;
            }
        }

        if(!stk.isEmpty()) return 0;

        return 1;
    }

    public static void main(String[] args) {
        String str1 = "{[()()]}";
        String str2 = "([)()]";

        System.out.println(bracketsSolution(str1));
        System.out.println(bracketsSolution(null));
    }
}
