package com.ll.baekjoon.sliver.s5.B1789;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());
        long num = 0;
        long count = 0;
        for (int i = 1; ; i++) {
            if (num > S) {
                break;
            }
            num += i;
            count++;
        }

        System.out.println(count - 1);


    }
}
