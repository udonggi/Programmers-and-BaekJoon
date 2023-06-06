package com.ll.baekjoon.sliver.s3.B1966;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int M = 0;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

//            PriorityQueue<Integer> sq = new PriorityQueue<>(((o1, o2) -> o2 - o1));

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
//                sq.add(num);
            }

            sb.append(printQ(queue, M)+"\n");

            queue.clear();


        }
        System.out.println(sb);



        br.close();

    }

    public static int printQ(Queue<Integer> queue, int M){
        int answer = 0;
        while(!queue.isEmpty()){
            int max = Collections.max(queue);
            if (queue.peek() == max) {
                queue.poll();

                answer++;
                if(M == 0) break;

            } else {
                int n = queue.poll();
                queue.add(n);
            }

            if (M == 0) {
                M = queue.size() - 1;
            } else {
                M--;
            }

        }

        return answer;
    }

}