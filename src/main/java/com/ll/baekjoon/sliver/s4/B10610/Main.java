package com.ll.baekjoon.sliver.s4.B10610;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        Integer[] arr = new Integer[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        if (arr[N.length()-1] != 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int i = 0; i < N.length()-1; i++) {
                sum += arr[i];
                sb.append(arr[i]);
            }

            if (sum % 3 == 0) {
                sb.append(0);
                System.out.println(sb);
            } else {
                System.out.println(-1);
            }
        }


    }
}
