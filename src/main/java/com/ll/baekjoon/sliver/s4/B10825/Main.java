package com.ll.baekjoon.sliver.s4.B10825;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][4];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
                if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                    if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
                        return o1[0].compareTo(o2[0]);
                    } else{
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                    }
                } else{
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
            } else{
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append("\n");
        }

        System.out.println(sb);


    }
}
