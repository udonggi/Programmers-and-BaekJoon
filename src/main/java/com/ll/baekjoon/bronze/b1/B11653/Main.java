package com.ll.baekjoon.bronze.b1.B11653;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                N /= i;
                sb.append(i).append("\n");
            }
        }

        if (N != 1) {
            sb.append(N).append("\n");
        }

        System.out.println(sb);

    }
}
