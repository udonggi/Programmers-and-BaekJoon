package com.ll.programmers.Lv3.P42627;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[][] jobs = new int[][]{{0, 3}, {0, 2}, {1, 9}, {2, 6}};
        System.out.println(new Solution2().solution(jobs));

    }
}

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        //Arrays.sort(jobs, (a1, a2) -> a1[0] - a2[0]);
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int i = 0;
        int j = 0;
        int sum = 0;
        int time = 0;
        while (j < jobs.length) {// [0,7] [0,5] 들어오면 [0,7] 먼저 수행하는게 아니라 [0.5]를 수행해야함
            while (true) {
                if (i == jobs.length) break;
                if (jobs[i][0] <= time) {
                    pq.add(jobs[i]);
                    i++;
                } else {
                    break;
                }
            }


            if (pq.isEmpty()) {
                time = jobs[i][0];
                continue;
            }

            int[] store = pq.poll();
            sum += store[1] + time - store[0];
            time = time + store[1];
            j++;


        }


        answer = (int) Math.floor(sum / jobs.length);
        return answer;
    }
}


class Solution2 {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];

            }
        });

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int i = 1;
        int j = 1;
        int sum = jobs[0][1];
        int time = jobs[0][1] + jobs[0][0]; /*처음거는 무조건 먼저 -> sort 다르게 해서
        먼저 요청이 들어온 작업부터 처리 실패! 동일한 시간에 요청이 들어온 것 중 더 짧은 시간이 걸리는 거 먼저 수행하도록 해야함
        [0,7] [0,5] 들어오면 [0,7] 먼저 수행하는게 아니라 [0.5]를 수행해야함*/
        while (j != jobs.length) {
            while (true) {
                if (i == jobs.length) break;
                if (jobs[i][0] <= time) {
                    pq.add(jobs[i]);
                    i++;
                } else {
                    break;
                }
            }


            if (pq.isEmpty()) {
                time = jobs[i][0];
                continue;
            }

            int[] store = pq.poll();
            sum += store[1] + time - store[0];
            time = time + store[1];
            j++;


        }


        answer = (int) Math.floor(sum / jobs.length);
        return answer;
    }
}