package com.devjenni.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

/*
    [Queue]
    선입선출
    offer(삽입), poll(삭제 후 반환), peek(출력, 삭제X)
 */
public class 큐 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(2);
        q.offer(4);
        q.offer(1);
        q.poll();
        q.offer(3);
        q.offer(7);
        q.offer(6);
        q.poll();
        q.offer(8);

        // 4 1 3 7 6 8
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
