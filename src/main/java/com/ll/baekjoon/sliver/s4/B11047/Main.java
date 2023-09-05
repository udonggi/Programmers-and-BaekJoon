package com.ll.baekjoon.sliver.s4.B11047;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            stack.push(num);
        }

        while (true) {
            if (K == 0) {
                break;
            }

            int n = stack.pop();
            int i = K / n;

            if (i > 0) {
                K -= n*i;
                answer += i;
            }

        }

        System.out.println(answer);



    }

}