package com.ll.baekjoon.sliver.s5.B1181;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            list.add(s);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length()-o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            if (!sb.toString().contains(s)) {
                sb.append(s).append('\n');
            }
        }

        System.out.println(sb);



    }

}