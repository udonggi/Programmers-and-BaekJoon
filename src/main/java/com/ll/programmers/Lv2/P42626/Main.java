package com.ll.programmers.Lv2.P42626;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] scoville = new int[]{1, 2, 3};
        int K = 11;
        System.out.println(new Solution().solution(scoville, K));
    }
}


class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) { //우선순위큐에다 다 넣기
            pq.add(i);
        }
        while (true) {
            if (pq.peek() < K) { //맨 앞이 K 보다 작다면 섞어야한다.
                int a = pq.poll();
                int b = pq.poll();
                int c = a + b * 2;
                pq.add(c); //섞고 다시 넣기
                answer++;
            } else { //맨 앞이 K보다 크거나 같으면 더이상 섞을 필요 없다
                break;
            }
            if (pq.size() == 1) { //1개 남았을 때 K보다 작으면 실패, 아니면 성공이다.
                if (pq.peek() < K) {
                    answer = -1;
                }
                break;
            }
        }
        return answer;
    }
}