package com.ll.baekjoon.sliver.s3.B14501;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

//        int[] T = new int[N];
//        int[] P = new int[N];
//
//        for (int i=0; i<N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            T[i] = Integer.parseInt(st.nextToken());
//            P[i] = Integer.parseInt(st.nextToken());
//        }

        int[] T = new int[N+1];
        int[] P = new int[N+1];

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            T[i] = Integer.parseInt(st.nextToken()); // 상담 하는데 걸리는 일 수
            P[i] = Integer.parseInt(st.nextToken()); // 돈
        }

        //끝에서부터 시작하는 점화식 방법
        int[] DP = new int[N+2];

        for(int i = N; i > 0; i--) {
            int next = i + T[i]; // 다음 날짜

            if(next > N + 1) { // 넘는 경우
                DP[i] = DP[i + 1];
            } else {

                DP[i] = Math.max(DP[i + 1], P[i] + DP[next]);
            }
        }

        System.out.println(DP[1]);
        // 처음부터 시작하는 점화식
//        int[] dp = new int[N+1];
//
//
//        for (int i=0; i<N; i++) {
//            if (i + T[i] <= N) {
//
//                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
//            }
//
//            dp[i+1] = Math.max(dp[i+1], dp[i]);
//        }
//
//        System.out.println(dp[N]);

    }
}