package com.ll.baekjoon.sliver.s4.B1065;

import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = 99;

        if (N < 100) {
            System.out.println(N);
        } else {
            for (int i = 100; i <= N; i++) {
                int find = new Solution().find(i);
                if (find == 1) {
                    answer++;
                }
            }
            System.out.println(answer);
        }

    }
}

class Solution {

    public int find(int N) {
        int find_result = 0;
        String num = String.valueOf(N);
        int n1 = num.charAt(0) - '0';
        int n2 = num.charAt(1) - '0';
        int n3 = num.charAt(2) - '0';
        if (n2 - n1 == n3 - n2) {
            return 1;
        }

        return find_result;
    }

}
