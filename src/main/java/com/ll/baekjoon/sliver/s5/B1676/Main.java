package com.ll.baekjoon.sliver.s5.B1676;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 1; i <= N; i++) {
            int tmp = i;
            while (tmp % 5 == 0) {
                count++;
                tmp /= 5;
            }
        }

        System.out.println(count);
    }
}

/*public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger f = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        String n = f.toString();
        int count = 0;

        for (int i = n.length()-1; i > 0; i--) {
            if (n.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}*/
