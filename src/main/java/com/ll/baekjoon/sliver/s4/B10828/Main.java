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
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String cmd = sc.nextLine();
            if (cmd.contains("push")) {
                String sp[] = cmd.split(" ");
                stack.push(Integer.parseInt(sp[1]));
            }


            if (cmd.equals("pop")) { //pop
                if (stack.empty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            }

            if (cmd.equals("size")) sb.append(stack.size() + "\n");

            if (cmd.equals("empty")) {
                if (stack.empty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            }

            if (cmd.equals("top")) {
                if (stack.empty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }

        System.out.print(sb);

    }
}