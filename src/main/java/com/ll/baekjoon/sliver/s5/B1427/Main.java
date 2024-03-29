package com.ll.baekjoon.sliver.s5.B1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for (int i = N.length()-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }




    }


}


// 두 번째 방법

//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String N = br.readLine();
//
//        Integer[] arr = new Integer[N.length()];
//
//        for (int i = 0; i < N.length(); i++) {
//            arr[i] = N.charAt(i) - '0';
//        }
//
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for (int i = 0; i < N.length(); i++) {
//            System.out.print(arr[i]);
//        }
//
//
//
//    }
//
//
//}