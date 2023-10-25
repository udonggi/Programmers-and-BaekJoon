package com.ll.baekjoon.sliver.s5.B1475;

import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int[] arr = new int[10];

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);

            switch (c) {
                case '0':
                    arr[0] += 1;
                    break;
                case '1':
                    arr[1] += 1;
                    break;
                case '2':
                    arr[2] += 1;
                    break;
                case '3':
                    arr[3] += 1;
                    break;
                case '4':
                    arr[4] += 1;
                    break;
                case '5':
                    arr[5] += 1;
                    break;
                case '6':
                    arr[9] += 1;
                    break;
                case '7':
                    arr[7] += 1;
                    break;
                case '8':
                    arr[8] += 1;
                    break;
                case '9':
                    arr[9] += 1;
                    break;
            }
        }

        int n = arr[9] / 2;
        if (arr[9] % 2 != 0) {
            n += 1;
        }

        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        max = Math.max(max, n);

        System.out.println(max);

    }
}
