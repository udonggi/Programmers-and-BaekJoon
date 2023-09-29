package com.ll.baekjoon.sliver.s4.B2164;

import java.util.*;
        import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (true) {
            int num= q.poll();

            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            } else if (q.isEmpty()) {
                System.out.println(num);
                break;
            }

            int n = q.poll();
            q.add(n);

        }
    }
}
