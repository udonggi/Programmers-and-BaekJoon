package com.ll.test;


import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
//        Map<String, String> 사람1 = new HashMap<>();
//        사람1.put("이름", "홍길동");
//        사람1.put("나이", "22");
//        사람1.put("키", "170.5");
//        Map<String, String> 사람2 = new HashMap<>();
//        사람2.put("이름", "홍길순");
//        사람2.put("나이", "25");
//        사람2.put("키", "162.4");
//        System.out.println(사람1);
//        System.out.println(사람2);

        int[][] edges = {{5, 2}, {2, 3}, {2, 4}, {5, 1}, {1, 7}, {1, 9}};
        System.out.println(Arrays.toString(new Solution().solution(edges)));
    }
}

class Solution {
    List<Integer>[] tree;
    boolean[] visited;
    int[] answer;
    int idx = 0;

    public int[] solution(int[][] edges) {
        int N = edges.length + 1;
        tree = new ArrayList[N+1];
        visited = new boolean[N+1];
        answer = new int[N];
        int[] degree = new int[N+1];
        for(int i=1; i<=N; i++) tree[i] = new ArrayList<>();
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree[u].add(v);
            tree[v].add(u);
            degree[u]++;
            degree[v]++;
        }
        for(int i=1; i<=N; i++) {
            Collections.sort(tree[i]);
        }
        int root = 1;
        for(int i=1; i<=N; i++) {
            if(degree[i] == 1) {
                root = i;
                break;
            }
        }
        dfs(root);
        return answer;
    }

    public void dfs(int node) {
        visited[node] = true;
        answer[idx++] = node;
        for(int next : tree[node]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}

/*class Sol1 {

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<>();

        int i =0;
        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            al.add(num);
        }

        Collections.sort(al);

        StringBuilder sb = new StringBuilder();

        for (int number : al) {

            if (sb.isEmpty() == false) {
                sb.append(", ");
            }

            sb.append(number);
        }

        System.out.printf("입력한 숫자(오름차순) : %s\n", sb);
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}

class Sol2 {

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<>();

        int i =0;
        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            al.add(num);
        }

        String str = al
                .stream().sorted().map(e -> ""+e).collect(Collectors.joining(", "));

        System.out.printf("입력한 숫자(오름차순) : %s\n", str);
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}*/
