package com.ll.baekjoon.sliver.s5.B118866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = K-1;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (true) {

            //하나 남으면
            if (list.size() == 1) {
                sb.append(list.get(0)).append(">");
                break;
            }

            if (index > list.size() - 1) {
                while (index > list.size()-1) {
                    index -= list.size();
                }
                sb.append(list.get(index)).append(", ");
                list.remove(index);
                index--;
            } else {
                sb.append(list.get(index)).append(", ");
                list.remove(index);
                index--;
            }

            index += K;
        }

        System.out.println(sb);

    }
}
