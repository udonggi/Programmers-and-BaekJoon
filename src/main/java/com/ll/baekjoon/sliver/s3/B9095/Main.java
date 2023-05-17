package com.ll.baekjoon.sliver.s3.B9095;

import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num = new int[T];
        for (int i = 0; i < T; i++) {
            num[i] = sc.nextInt();
        }
        int dp[] = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;


        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(dp[num[i]]);
        }
    }
}