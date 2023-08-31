package com.ll.baekjoon.sliver.s4.B9021;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int T = Integer.parseInt(br.readLine());
//
//        while (T-- > 0) {
//            sb.append(solve(br.readLine())).append('\n');
//        }
//        System.out.println(sb);
//
//    }
//
//    public static String solve(String s) {
//
//        int count = 0;
//
//        for (char c : s.toCharArray()) {
//
//            // 여는 괄호일 경우 카운트 증가
//            if (c == '(') {
//                count++;
//            } else if (count == 0) {
//                return "NO";
//            } else {
//                count--;
//            }
//        }
//
//        if (count == 0) {
//            return "YES";
//        } else {
//            return "NO";
//        }
//    }
//}

public class Main { //stack으로 풀기

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}