package com.ll.baekjoon.sliver.s4.B1764;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> name = new HashSet<>();

        for (int i = 0; i < N; i++) {
            name.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        int count = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (name.contains(s)) {
                count++;
                list.add(s);
            }
        }

        Collections.sort(list);

        sb.append(count).append("\n");
        for (String i : list) {
            sb.append(i).append("\n");
        }



        System.out.println(sb);
    }

}
