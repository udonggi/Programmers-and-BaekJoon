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
            int num = calc(list.get(i), list.get(i-1), N, number);

            int repeat = Integer.parseInt(String.valueOf(N).repeat(i));
            list.get(i).add(repeat); //55, 555같은거 넣기

            if (num == 1 || repeat == number) {
                return i;
            }

        }
        return -1;

    }

    public int calc(Set<Integer> newSet, Set<Integer> preSet, int N, int number) {
        int divide = -1;
        for (int pre : preSet) {
            newSet.add(pre + N);
            newSet.add(pre - N);
            newSet.add(pre * N);
            if (N != 0) {
                newSet.add(pre / N);
                divide = pre / N;
            }

            if (pre + N == number || pre - N == number || pre * N == number || divide == number) { //답일 경우
                return 1;
            }
        }
        return 0;
    }
}