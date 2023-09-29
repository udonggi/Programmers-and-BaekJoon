package com.ll.baekjoon.bronze.b2.B10809;

import java.util.*;
import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a';

            if (arr[n] == -1) {
                arr[n] = i;
            }

        }

        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
