package com.ll.baekjoon.sliver.s2.B11053;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] s = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            s[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (s[j] < s[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        Arrays.sort(dp);

        System.out.println(dp[dp.length - 1]);



    }
}
