package com.ll.baekjoon.sliver.s3.B2606;

import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드의 개수 (노드의 개수는 최대 100,000개라고 가정)
        int n = Integer.parseInt(br.readLine());

        adjList = new ArrayList[n+1];

        for(int i=1; i<=n; i++){
            adjList[i] = new ArrayList<>();
        }

        int m = Integer.parseInt(br.readLine());

        for (int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            adjList[node1].add(node2);
            adjList[node2].add(node1);
        }

        visited = new boolean[n+1];

        // DFS 함수 호출
        dfs(1);

        System.out.println(count-1);

    }

    public static void dfs(int x){
        if(visited[x]){
            return;
        }

        visited[x] = true;

        count++;

        for(int y : adjList[x]){
            dfs(y);
        }
    }
}
