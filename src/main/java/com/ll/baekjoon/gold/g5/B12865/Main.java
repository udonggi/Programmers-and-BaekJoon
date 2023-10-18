package com.ll.baekjoon.gold.g5.B12865;

import java.util.*;
import java.io.*;

public class Main {

    static Integer[][] dp;
    static int[] W;
    static int[] V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        W = new int[N];
        V = new int[N];

        dp = new Integer[N][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(N - 1, K));


    }

    static int knapsack(int n, int k) {
        if (n < 0) {
            return 0;
        }

        if (dp[n][k] == null) {
            if (W[n] <= k) {
                dp[n][k] = Math.max(knapsack(n - 1, k), knapsack(n - 1, k - W[n]) + V[n]);
            } else {
                dp[n][k] = knapsack(n - 1, k);
            }
        }

        return dp[n][k];
    }
}
