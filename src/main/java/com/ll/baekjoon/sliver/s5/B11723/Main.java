package com.ll.baekjoon.sliver.s5.B11723;

import java.util.*;
import java.io.*;
public class Main {
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "add":
                    int n1 = Integer.parseInt(st.nextToken());
                    add(set, n1);
                    break;
                case "remove":
                    int n2 = Integer.parseInt(st.nextToken());
                    remove(set, n2);
                    break;
                case "check":
                    int n3 = Integer.parseInt(st.nextToken());
                    check(set, n3);
                    break;
                case "toggle":
                    int n4 = Integer.parseInt(st.nextToken());
                    toggle(set, n4);
                    break;
                case "all":
                    all(set);
                    break;
                case "empty":
                    empty(set);
                    break;
            }
        }

        System.out.println(sb);

    }

    public static void add(Set<Integer> set, int n){
        set.add(n);
    }

    public static void remove(Set<Integer> set, int n) {
        set.remove(n);
    }

    public static void check(Set<Integer> set, int n) {
        if (set.contains(n)) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public static void toggle(Set<Integer> set, int n) {
        if (set.contains(n)) {
            set.remove(n);
        } else {
            set.add(n);
        }
    }

    public static void all(Set<Integer> set) {
        set.clear();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
    }

    public static void empty(Set<Integer> set) {
        set.clear();
    }


}
