package com.ll.programmers.Lv2.P42587;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;
        System.out.println(new Solution().solution(priorities, location));
    }
}


class Solution {
    public int solution(int[] priorities, int location) {

        Queue<Integer> pl = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            pl.add(priorities[i]);
        }

        int answer = 0;

        while (true) {
            int max = 0;
            for (int i : pl) { //반복문 돌면서 제일 큰 수 찾아두기
                if (i > max) max = i;
            }

            if (pl.peek() < max) { //제일 큰수보다 앞에 숫자가 작으면 프린트 못하고 뒤로 넘어간다.
                pl.add(pl.poll()); //앞에거 빼서 뒤에다 넣기
                if (location == 0) location = pl.size() - 1; //내가 요청한 문서 위치가 맨 앞인데 인쇄 안되고 뒤로 넘어가므로 위치 초기화
                else location--;
            } else {  //제일 큰 수이면 프린트된다.
                answer++;
                pl.poll(); //프린트
                if (location == 0) return answer; //프린트되는 것이 내가 요청한 문서이면 반환
                location--;
            }
            if (pl.size() == 1) { //하나 남았을 경우는 루프 안돌고 그냥 1 증가시켜서 반환하면 됨
                answer++;
                break;
            }
        }
        return answer;

    }
}