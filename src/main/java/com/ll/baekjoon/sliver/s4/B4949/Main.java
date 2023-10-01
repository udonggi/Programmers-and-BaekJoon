package com.ll.baekjoon.sliver.s4.B4949;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();


        loop: while (true) {
            String s = br.readLine();

            if (s.length() == 1) {
                if (s.equals(".")) {
                    break;
                }
            }

            Stack<Character> stack = new Stack<>();


            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                }

                if (c == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        sb.append("no").append("\n");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        sb.append("no").append("\n");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.empty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }


        }

        System.out.println(sb);

    }
}
