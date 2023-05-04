package com.ll.programmers.Lv2.P43165;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        Solution solution = new Solution();
        System.out.println(solution.solution(numbers, target));
    }
}


class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        list.add(-numbers[0]); //맨 처음 숫자 음수로
        list.add(numbers[0]); // 맨 처음 숫자 양수로
        for (int i = 1; i < numbers.length; i++) {
            List<Integer> temp = new ArrayList<>(); // 임시 리스트 생성
            for (int j = 0; j < list.size(); j++) {
                temp.add(list.get(j) + numbers[i]); // 임시 리스트에 기존 리스트의 숫자에 새로운 숫자를 더한 값을 추가
                temp.add(list.get(j) - numbers[i]); // 임시 리스트에 기존 리스트의 숫자에 새로운 숫자를 뺀 값을 추가
            }
            list = temp;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                answer++;
            }
        }
        return answer;

    }
}