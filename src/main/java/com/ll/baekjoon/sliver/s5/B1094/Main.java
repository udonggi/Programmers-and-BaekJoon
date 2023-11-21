package com.ll.baekjoon.sliver.s5.B1094;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int n = 64;
        int plus = 0;
        int count = 0;
        while (true) {
            if (X == 64) {
                count++;
                break;
            }
            if (X == plus) {
                break;
            }

            if (n == 1) {
                plus += n;
                count++;
                continue;
            }

            if (X > plus) {
                n /= 2;
                if (X >= plus+n) {
                    plus += n;
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}
