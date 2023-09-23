package com.ll.baekjoon.sliver.s5.B1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] answer = new int[30][30];

        /**N,M이 같으면 1개**/
        for (int i = 0; i < 30; i++) {
            answer[i][i] = 1;
            answer[i][0] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                answer[i][j] = answer[i - 1][j - 1] + answer[i - 1][j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(answer[M][N]).append("\n");
        }

        System.out.println(sb);
    }
}

//재귀로 풀기
/*public class Main {

    static int[][] answer = new int[30][30];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());	// N = r
            int M = Integer.parseInt(st.nextToken());	// M = n


            sb.append(combi(M, N)).append('\n');
        }

        System.out.println(sb);

    }

    static int combi(int n, int r) {

        if(dp[n][r] > 0) {
            return answer[n][r];
        }

        if(n == r || r == 0) {
            return answer[n][r] = 1;
        }

        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}*/
