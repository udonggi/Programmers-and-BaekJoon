package com.ll.baekjoon.sliver.s4.B10773;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        int K = Integer.parseInt(br.readLine());

        stack.push(Integer.parseInt(br.readLine())); //처음 하나 넣기

        for(int i = 1; i < K; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                stack.pop();
            } else{
                stack.push(num);
            }
        }

        for (int i : stack) {
            sum += i;
        }

        System.out.println(sum);

    }

}
