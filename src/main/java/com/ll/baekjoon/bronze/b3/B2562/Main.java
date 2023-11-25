package com.ll.baekjoon.bronze.b3.B2562;

import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) {
                index = i+1;
                max = arr[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(index);
        System.out.println(sb);

    }
}
