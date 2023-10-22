package com.ll.baekjoon.sliver.s2.B1260;

import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        //초기화
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        //간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            adjList[node1].add(node2);
            adjList[node2].add(node1);
        }

        visited = new boolean[N + 1];

        dfs(V);
        sb.append("\n");

        visited = new boolean[N + 1];

        bfs(V);

        System.out.println(sb);

    }

    static void dfs(int x){
        if (visited[x]) {
            return;
        }

        visited[x] = true;

        sb.append(x).append(" ");

        for (int next : adjList[x]) {
            dfs(next);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");

            for (int next : adjList[node]) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }

}
