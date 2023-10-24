package com.ll.programmers.Lv1.P12945;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(new Solution().solution(n));
    }

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        if(n !=0 && n!=1){
            for(int i = 2 ; i <= n; i++) {
                fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
            }
        }
        answer = fibo[n];
        return answer;
    }

}
