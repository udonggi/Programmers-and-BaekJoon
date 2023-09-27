package com.ll.baekjoon.bronze.b2.B1152;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int count = 1;

        if(s.charAt(0) == ' '){
            count--;
        }

        if (s.charAt(s.length()-1) == ' ') {
            count--;
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
