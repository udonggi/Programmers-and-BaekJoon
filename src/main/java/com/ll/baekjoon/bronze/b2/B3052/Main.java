package com.ll.baekjoon.bronze.b2.B3052;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        int num = Integer.parseInt(br.readLine());
        list.add(num % 42);
        answer++;

        for (int i = 1; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (!list.contains(n%42)){
                answer++;
                list.add(n%42);
            }
        }
        System.out.println(answer);





    }


}
