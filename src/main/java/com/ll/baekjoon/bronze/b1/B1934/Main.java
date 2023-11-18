package com.ll.baekjoon.bronze.b1.B1934;

import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int AB = A * B;

            while (B != 0) {
                int r = A % B;
                A = B;
                B = r;
            }

            sb.append(AB / A).append("\n");
        }

        System.out.println(sb);

    }
}
