package com.ll.baekjoon.sliver.s4.B2003;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int start = 0;
        int end = 0;
        int count = 0;

        while (true) {
            if (sum >= M) {
                sum -= arr[start];
                start++;
            } else if (end == N) {
                break;
            } else {
                sum += arr[end];
                end++;
            }

            if (sum == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
