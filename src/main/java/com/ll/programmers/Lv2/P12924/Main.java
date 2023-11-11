package com.ll.programmers.Lv2.P12924;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(new Solution().solution(n));

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int num = i;
            while (true) {
                if (sum == n) {
                    answer++;
                    break;
                }

                if (sum > n) {
                    break;
                }
                sum += num;
                num++;
            }
        }
        return answer;
    }
}