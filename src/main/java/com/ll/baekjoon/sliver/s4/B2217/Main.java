package com.ll.baekjoon.sliver.s4.B2217;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int weight = 0;
        for (int i = 0; i < N; i++) {
            weight = Math.max(weight, arr[i] * (N - i));
        }

        System.out.println(weight);
    }
}
