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

        int count = (V - B) / (A - B);

        if ((V - B) % (A - B) > 0) {
            count++;
        }


        System.out.println(count);
    }
}
