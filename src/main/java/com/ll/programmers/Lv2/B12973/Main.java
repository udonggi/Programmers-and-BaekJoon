package com.ll.programmers.Lv2.B12973;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        String s = "";

        System.out.println(new Solution().solution(s));

    }
}

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        int i = 1;
        if (s.isEmpty()) {
            return 0;
        }
        stack.push(s.charAt(0));
        while (true) {
            if (i == s.length()) {
                break;
            }


            if (!stack.isEmpty()) {
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else{
                stack.push(s.charAt(i));
            }

            i++;

        }

        if (stack.isEmpty()) {
            answer = 1;
        }

        return answer;
    }
}