package com.ll.programmers.Lv3.P42895;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 2;
        int number = 11;
        int answer = solution.solution(N, number);
        System.out.println(answer);

    }
}

class Solution {
    public int solution(int N, int number) {
        if (N == number) { // N을 사용해 number을 만드는데 같으면 1번
            return 1;
        }

        List<Set<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) { //8개까지이므로 8개 저장할 공간 만들기
            list.add(new HashSet<>());
        }

        list.get(1).add(N); // 맨 처음은 자기 자신 N=5라 치면 5 하나

        for (int i = 2; i < 9; i++) {
            int repeat = Integer.parseInt(String.valueOf(N).repeat(i));
            list.get(i).add(repeat); //55, 555같은거 넣기

            for (int j = 1; j < i; j++) {
                int num = calc(list.get(i), list.get(j), list.get(i - j), number); //3번째면 (1,2) (2,1) 4번째는 (1,3) (3,1) (2,2)

                if (num == 1 || repeat == number) {
                    return i;
                }
            }

        }
        return -1;

    }

    public int calc(Set<Integer> newSet, Set<Integer> set1, Set<Integer> set2, int number) {
        int divide = 0;
        for (int i : set1) {
            for (int j : set2) {
                newSet.add(i + j);
                newSet.add(i - j);
                newSet.add(i * j);

                if (i != 0 && j != 0) {
                    newSet.add(i / j);
                    divide = i / j;
                }

                if (i + j == number || i - j == number || i * j == number || divide == number) {
                    return 1;
                }
            }
        }
        return 0;
    }
}