package com.ll.baekjoon.bronze.b1.B2609;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int n1 = gcd(A, B);
        int n2 = (A / n1) * (B / n1) * n1;

        StringBuilder sb = new StringBuilder();

        sb.append(n1).append("\n").append(n2);

        System.out.println(sb);

    }

    static int gcd(int A, int B){

        while (B != 0) {
            int n = A % B;

            A = B;
            B = n;
        }
        return A;
    }
}
