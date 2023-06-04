package com.ll.baekjoon.sliver.s4.B10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행문자 날려주기
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String cmd = sc.nextLine();
            if (cmd.contains("push")) {
                String sp[] = cmd.split(" ");
                stack.push(Integer.parseInt(sp[1]));
            }


            if (cmd.equals("pop")) { //pop
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }

            if (cmd.equals("size")) System.out.println(stack.size());

            if (cmd.equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }

            if (cmd.equals("top")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            }
        }

    }
}