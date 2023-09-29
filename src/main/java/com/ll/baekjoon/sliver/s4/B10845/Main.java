package com.ll.baekjoon.sliver.s4.B10845;

import java.util.*;
import java.io.*;

public class Main {
    static int[] q = new int[10001];
    static int first = 0;
    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push" -> {
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                }
                case "pop" -> {
                    int num = pop();
                    sb.append(num).append("\n");
                }
                case "size" -> {
                    int num = size();
                    sb.append(num).append("\n");
                }
                case "empty" -> {
                    int num = empty();
                    sb.append(num).append("\n");
                }
                case "front" -> {
                    int num = front();
                    sb.append(num).append("\n");
                }
                case "back" -> {
                    int num = back();
                    sb.append(num).append("\n");
                }
            }
        }

        System.out.println(sb);
    }

    private static void push(int num) {
        q[last] = num;
        last++;
    }

    private static int pop() {
        if (first == last) {
            return -1;
        }

        int n = q[first];
        first++;

        return n;
    }

    private static int size() {
        return last - first;
    }

    private static int empty() {
        if (first == last) {
            return 1;
        } else{
            return 0;
        }
    }

    private static int front() {
        if (first == last) {
            return -1;
        }

        return q[first];
    }

    private static int back() {
        if (first == last) {
            return -1;
        }

        return q[last-1];
    }
}
