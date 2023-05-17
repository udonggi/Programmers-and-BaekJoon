package com.ll.baekjoon.sliver.s3.B1463;

import java.util.*;

import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] d = new int[N+1];

        d[1] = 0;
        for (int i = 2; i < N+1; i++) { //3가지 점화식으로 문제 풀이 , 메모이제이션 기법 활용
            d[i] = d[i-1]+1; // 1. -1 연산
            if (i % 2 == 0 && d[i] > d[i/2]+1) { // 2. 나누기 2 연산
                d[i] = d[i/2]+1;
            }
            if (i % 3 == 0 && d[i] > d[i/3]+1) { // 3. 나누기 3 연산
                d[i] = d[i/3]+1;
            }
        }
        System.out.println(d[N]);
    }
}



//메모리 초과 나옴
/*
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
        System.out.print(new Solution().solution(N));

    }
}


class Solution {
    public int solution(int N) {
        List<Set<Integer>> list = new ArrayList<>();

        list.add(new HashSet<>());
        list.get(0).add(N);

        int i = 0;

        while (true) {
            list.add(new HashSet<>());
            i++;
            int num = calc(list.get(i), list.get(i-1));
            if (num == 1) {
                break;
            }
        }

        return i;
    }

    public int calc(Set<Integer> newSet, Set<Integer> oldSet) {
        int n = 0;
        for (int i : oldSet) {
            if(i-1 == 1 || i / 3 == 1 ) return 1;
            if (i % 3 == 0) {
                newSet.add(i / 3);
                continue;
            }

            newSet.add(i - 1);

            if (i % 2 == 0) {
                newSet.add(i / 2);
            }
        }
        return 0;
    }
}*/
