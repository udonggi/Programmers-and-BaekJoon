package com.ll.baekjoon.bronze.b2.B2908;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        int n1 = Integer.parseInt(sb.toString());

        String B = st.nextToken();
        StringBuilder sb2 = new StringBuilder(B);
        sb2.reverse();
        int n2 = Integer.parseInt(sb2.toString());

        if (n1 > n2) {
            System.out.println(n1);
        } else{
            System.out.println(n2);
        }


    }
}
