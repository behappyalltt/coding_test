package com.devjenni.dfs_bfs;
import java.util.*;

/*
    [Stack]
    선입후출
    push(삽입), pop(삭제), peek(반환, 제거X)
 */
public class 스택 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(2);
        s.push(4);
        s.push(1);
        s.pop();
        s.push(3);
        s.push(7);
        s.push(6);
        s.pop();
        s.push(8);

        // 8 7 3 4 2 5
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
