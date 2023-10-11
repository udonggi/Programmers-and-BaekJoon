package com.ll.baekjoon.gold.g5.B11729;

import java.util.*;
import java.io.*;
public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = (int) Math.pow(2,N) -1;

        sb.append(answer).append("\n");

        hanoi(N, 1, 2, 3);
        System.out.println(sb);


    }

    public static void hanoi(int N, int first, int second, int third) {
        if (N == 1) {
            sb.append(first).append(" ").append(third).append("\n");
            return;
        }

        //n-1개 두 번째로 이동
        hanoi(N - 1, first, third, second);

        //1개를 맨 끝 칸으로 이동
        sb.append(first).append(" ").append(third).append("\n");

        //n-1개를 두 번째 칸에서 마지막 칸으로 이동
        hanoi(N - 1, second, first, third);
    }
}
