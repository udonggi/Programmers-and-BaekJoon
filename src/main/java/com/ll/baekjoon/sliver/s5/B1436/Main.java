package com.ll.baekjoon.sliver.s5.B1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int n = 666;
        int count = 0;

        while (true) {
            if (String.valueOf(n).contains("666")) {
                count++;
            }

            if(count == N){
                break;
            }

            n++;
        }

        System.out.println(n);

    }

}
