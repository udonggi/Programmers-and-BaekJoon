package com.ll.programmers.Lv2.P42584;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(new Solution().solution(prices)));
        System.out.println(Arrays.toString(new Solution2().solution(prices)));
    }
}

class Solution {
    public int[] solution(int[] prices) {
        /*Queue<Integer> q = new LinkedList<>();
        Queue<Integer> store = new LinkedList<>();
        int[] answer = new int[prices.length];
        for (int i : prices) {
            q.add(i);
        }
        while (!q.isEmpty()) {
            int num = 1;
            if (q.peek() == 1) {
                q.poll();
                store.add(q.size());
                continue;
            }
            int next = q.poll();
            for (int i : q) {
                if(next <= i){
                    num++;
                }
                else{
                    break;
                }
            }
            store.add(num);
            if (q.size() == 1) {
                store.add(0);
                break;
            }
        }
        int n = 0;
        for (int i : store) {
            answer[n] = i;
            n++;
        }*/
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int num = 0;
            if (i == prices.length - 1) {
                answer[i] = 0;
                break;
            }
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) { //다음 순서부터 비교 가격 내려가지 않으면 카운트 가격 내려가면 1초는 증가하니 카운트 하고 break
                    num++;
                } else {
                    num++;
                    break;
                }
            }
            answer[i] = num;
        }

        return answer;
    }
}

class Solution2 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int num = 0;
            if (i == prices.length - 1) {
                answer[i] = 0;
                break;
            }
            for (int j = i + 1; j < prices.length; j++) {
                num++; //위 코드에서 num 중복 삭제
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = num;
        }

        return answer;
    }

}