package com.ll.baekjoon.sliver.s4.B3036;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int B = Integer.parseInt(st.nextToken());
            int gcd = gcd(A, B);
            sb.append(A / gcd).append("/").append(B / gcd).append("\n");
        }

        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
