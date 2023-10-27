package com.ll.baekjoon.sliver.s4.B2960;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] primeNum = new boolean[N+1];

        int count = 0;

        for(int i = 2; i <= N; i++) {
            primeNum[i] = true;
        }

        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j += i) {
                if(!primeNum[j])
                    continue;
                primeNum[j] = false;
                count ++;
                if(count == K) {
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }


    }
}
