package com.ll.baekjoon.sliver.s4.B10816;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st1.nextToken());
            if (map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
                continue;
            }
            map.put(n, 1);
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(st2.nextToken());
            if (map.containsKey(n)) {
                sb.append(map.get(n)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

    }

}
