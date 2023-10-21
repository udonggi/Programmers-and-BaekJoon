package com.ll.baekjoon.sliver.s4.B11656;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int n = S.length();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = S.substring(i, n);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

    }
}
