package com.ll.baekjoon.sliver.s5.B2751;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            list.add(num);
        }

        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);




    }

}