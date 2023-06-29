package com.ll.baekjoon.bronze.b1.B1110;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        int answer = 0;
        while(true){

            int a = ((num/10) + (num%10)) % 10;
            int b = num % 10;
            num = b*10 + a;
            answer++;
            if(N == num) break;
        }

        System.out.println(answer);

    }


}