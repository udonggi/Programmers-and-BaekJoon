package com.ll.programmers.Lv2.P12939;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String s = "-1 -2 -3 -4";
        System.out.println(new Solution().solution(s));
    }

}

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];

        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        sb.append(arr[0]).append(" ").append(arr[arr.length - 1]);

        return sb.toString();
    }
}