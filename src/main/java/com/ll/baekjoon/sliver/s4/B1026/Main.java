package com.ll.baekjoon.sliver.s4.B1026;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        Integer[] arr1 = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        Integer[] arr2 = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr1[i] * arr2[i];
        }

        System.out.println(sum);
    }
}
