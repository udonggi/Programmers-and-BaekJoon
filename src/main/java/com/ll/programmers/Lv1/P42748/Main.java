package com.ll.programmers.Lv1.P42748;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(new Solution().solution(array, commands)));
    }
}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] copy = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //예시로 따지자면 2~5 범위 copy에 넣고 정렬한다
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2] - 1]; //정렬한 것의 3번째 숫자를 넣는다.
        }
        return answer;

    }
}