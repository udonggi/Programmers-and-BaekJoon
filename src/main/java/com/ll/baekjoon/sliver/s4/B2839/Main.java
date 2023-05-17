package com.ll.baekjoon.sliver.s4.B2839;

import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(new Calc().deliver(N));

    }
}

class Calc {
    public int deliver(int N) {
        int answer = 0;
        int n = N / 5;

        if (N % 5 == 0) {
            return n;
        }

        for (int i = n; i > 0; i--) {
            int d5 = N - (5 * i);
            if (d5 % 3 == 0) {
                int d3= d5 / 3;
                answer = i + d3;
                break;
            }
        }
        if (answer == 0) {
            if (N % 3 == 0) {
                return N / 3;
            }
            return -1;
        }
        return answer;
    }
}