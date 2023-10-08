package com.ll.baekjoon.bronze.b2.B2675;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {
                sb.append(String.valueOf(S.charAt(j)).repeat(n));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
