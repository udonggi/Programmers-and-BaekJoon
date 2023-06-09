package com.ll.baekjoon.sliver.s5.B4673;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[10000];

        for (int i = 0; i < 10000; i++) {
            arr[i] = selfNum(i + 1); // 정렬을 해도 중복은 있다. 중복 삭제해야한다.
        }

        int[] arr2 = Arrays.stream(arr).distinct().sorted().toArray();

        int n = 1;
        int k = 0;
        while (true) {
            if( n == 10000 ) break;

            if (n != arr2[k]) {
                System.out.println(n);
                n++;
            } else {
                n++;
                k++;
            }
        }

    }

    private static int selfNum(int i) {
        int sum = i;
        while (true) {
            if (i / 10 == 0) {
                sum += i;
                return sum;
            }

            sum += i % 10;
            i = i / 10;
        }
    }
}
