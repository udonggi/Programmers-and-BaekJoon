package com.ll.baekjoon.sliver.s4.B1269;

import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            if (set1.contains(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }

        System.out.println(A - count + B - count);


    }
}
