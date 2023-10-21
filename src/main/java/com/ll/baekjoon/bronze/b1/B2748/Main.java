package com.ll.baekjoon.bronze.b1.B2748;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] f = new long[n+1];

        f[0] = 0;

        if (n != 0) {
            f[1] = 1;
        }

        if (n != 0 && n != 1) {
            for (int i = 2; i <= n; i++) {
                f[i] = f[i - 2] + f[i - 1];
            }
        }

        System.out.println(f[n]);
    }
}
