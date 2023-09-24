package com.ll.baekjoon.bronze.b1.B2869;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int end = 0;
        int count = 0;

        while (true) {
            count ++;
            end += A;
            if (end >= V) {
                break;
            }
            end -= B;
        }

        System.out.println(count);
    }
}
