package com.ll.baekjoon.bronze.b1.B4344;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            list.clear();
            double sum = 0;
            double avg = 0;
            double count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            double N = Integer.parseInt(st.nextToken());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
                sum += num;
            }

            avg = sum / N;

            for (int num : list) {
                if (num > avg) {
                    count++;
                }
            }

            double ratio = Math.round(count / N * 100 * 1000) / 1000.0;
            System.out.println(String.format("%.3f",ratio) + "%");


        }

    }

}