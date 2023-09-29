package com.ll.baekjoon.bronze.b2.B10809;

import java.util.*;
import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < S.length(); i++) {

            switch (S.charAt(i)) {
                case 'a':
                    if (arr[0] != -1) {
                        continue;
                    }
                    arr[0] = i;
                    break;
                case 'b':
                    if (arr[1] != -1) {
                        continue;
                    }
                    arr[1] = i;
                    break;
                case 'c':
                    if (arr[2] != -1) {
                        continue;
                    }
                    arr[2] = i;
                    break;
                case 'd':
                    if (arr[3] != -1) {
                        continue;
                    }
                    arr[3] = i;
                    break;
                case 'e':
                    if (arr[4] != -1) {
                        continue;
                    }
                    arr[4] = i;
                    break;
                case 'f':
                    if (arr[5] != -1) {
                        continue;
                    }
                    arr[5] = i;
                    break;
                case 'g':
                    if (arr[6] != -1) {
                        continue;
                    }
                    arr[6] = i;
                    break;
                case 'h':
                    if (arr[7] != -1) {
                        continue;
                    }
                    arr[7] = i;
                    break;
                case 'i':
                    if (arr[8] != -1) {
                        continue;
                    }
                    arr[8] = i;
                    break;
                case 'j':
                    if (arr[9] != -1) {
                        continue;
                    }
                    arr[9] = i;
                    break;
                case 'k':
                    if (arr[10] != -1) {
                        continue;
                    }
                    arr[10] = i;
                    break;
                case 'l':
                    if (arr[11] != -1) {
                        continue;
                    }
                    arr[11] = i;
                    break;
                case 'm':
                    if (arr[12] != -1) {
                        continue;
                    }
                    arr[12] = i;
                    break;
                case 'n':
                    if (arr[13] != -1) {
                        continue;
                    }
                    arr[13] = i;
                    break;
                case 'o':
                    if (arr[14] != -1) {
                        continue;
                    }
                    arr[14] = i;
                    break;
                case 'p':
                    if (arr[15] != -1) {
                        continue;
                    }
                    arr[15] = i;
                    break;
                case 'q':
                    if (arr[16] != -1) {
                        continue;
                    }
                    arr[16] = i;
                    break;
                case 'r':
                    if (arr[17] != -1) {
                        continue;
                    }
                    arr[17] = i;
                    break;
                case 's':
                    if (arr[18] != -1) {
                        continue;
                    }
                    arr[18] = i;
                    break;
                case 't':
                    if (arr[19] != -1) {
                        continue;
                    }
                    arr[19] = i;
                    break;
                case 'u':
                    if (arr[20] != -1) {
                        continue;
                    }
                    arr[20] = i;
                    break;
                case 'v':
                    if (arr[21] != -1) {
                        continue;
                    }
                    arr[21] = i;
                    break;
                case 'w':
                    if (arr[22] != -1) {
                        continue;
                    }
                    arr[22] = i;
                    break;
                case 'x':
                    if (arr[23] != -1) {
                        continue;
                    }
                    arr[23] = i;
                    break;
                case 'y':
                    if (arr[24] != -1) {
                        continue;
                    }
                    arr[24] = i;
                    break;
                case 'z':
                    if (arr[25] != -1) {
                        continue;
                    }
                    arr[25] = i;
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
