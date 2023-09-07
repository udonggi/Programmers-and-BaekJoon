package com.ll.baekjoon.sliver.s5.B1193;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 0;

        while(true) {
            count++;
            num += count;

            if(num >= X) {
                break;
            }
        }

        int diff = num - X;

        int a = 0;

        if(count % 2 == 0) {
            a = count - diff;
        } else {
            a = 1 + diff;
        }

        int b = count + 1 - a;

        System.out.println(a + "/" + b);


    }

}