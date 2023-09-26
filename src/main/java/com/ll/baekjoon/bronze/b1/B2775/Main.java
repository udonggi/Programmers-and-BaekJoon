package com.ll.baekjoon.bronze.b1.B2775;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] res = new int[15][15];

        for (int i = 0; i < 15; i++) {
            res[i][1]= 1;
            res[0][i] = i; //0층 초기화
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                res[i][j] = res[i-1][j] + res[i][j-1];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(res[k][n]);
        }
    }



}
