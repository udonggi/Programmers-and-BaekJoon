package com.ll.programmers.Lv2.P12951;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String s = "dka ";
        System.out.println(new Solution().solution(s));
    }
}


class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        //맨 처음 바꾸기
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        for (int i = 0; i < s.length(); i++) {
            //공백문자 다음이 공백 문자 아니면 바꾸기
            if(i+1 < s.length()) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                    s = s.substring(0, i + 1) + s.substring(i + 1, i + 2).toUpperCase() + s.substring(i + 2);
                }
            }
        }


        return s;
    }
}