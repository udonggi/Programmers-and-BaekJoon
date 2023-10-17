package com.ll.baekjoon.bronze.b2.B2750;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new TreeSet<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();

        for (int i : set) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
