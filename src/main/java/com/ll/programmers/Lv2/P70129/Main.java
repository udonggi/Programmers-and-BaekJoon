package com.ll.programmers.Lv2.P70129;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String s = "01110";
        System.out.println(Arrays.toString(new Solution().solution(s)));
    }
}

class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int count = 0;
        while (!s.equals("1")) {

            zero += s.length() - s.replace("0", "").length();

            s = s.replace("0", "");

            s = String.valueOf(s.length());

            s = Integer.toBinaryString(Integer.parseInt(s));

            count++;
        }

        int[] answer = {count, zero};

        return answer;
    }
}