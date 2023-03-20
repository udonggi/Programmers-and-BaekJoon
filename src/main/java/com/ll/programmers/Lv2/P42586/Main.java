package com.ll.programmers.Lv2.P42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        int[] progresses = new int[]{95,90,99,99,80,99};
        int[] speeds = new int[]{1,1,1,1,1,1};
        System.out.println(Arrays.toString(new Solution().solution(progresses, speeds)));
    }
}


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> store = new ArrayList<>();
        //100에서 준 숫자 빼고 나머지 있으면 speeds로 나눈 몫 +1 없으면 speeds로 나눈 몫 그대로
        //뒤에서부터 해서 stack에 넣기 (그러면 꺼낼때 처음부터 꺼낼 수 있음)
        for(int i = progresses.length-1; i >= 0; i--){
            if((100-progresses[i]) % speeds[i] != 0 ){
                progresses[i] = (100-progresses[i]) / speeds[i] + 1;
                stack.push(progresses[i]);
            }
            else{
                progresses[i] = (100-progresses[i]) / speeds[i];
                stack.push(progresses[i]);
            }
        }

        int p = stack.pop(); //첫 숫자 미리 넣기
        int count = 1; //처음 1
        for(int i = 1; i < progresses.length; i++){
            if(p >= stack.peek()){ // 다음거 비교했을 때 자신이 더 크면
                stack.pop(); // pop하여 꺼내고 (저장 x, 왜냐하면 맨 앞이 기준)
                count++; //숫자 증가
            }
            else{
                store.add(count); //비교했는데 뒤 숫자(끝나는 시간) 가 더 크면 리스트에 지금까지 더한거 저장하고
                p = stack.pop(); // p에 뒤 숫자 저장
                count = 1; // 초기화
            }
            if(stack.empty()){ // 스택 비어있으면
                store.add(count); //리스트에 저장하고 끝내기
            }
        }
        ;
        int[] answer = new int[store.size()];
        for(int i = 0; i< answer.length; i++){
            answer[i] = store.get(i);
        }

        return answer;
    }
}