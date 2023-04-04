package com.ll.programmers.Lv2.P42746;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        int[] numbers = new int[] {1, 10, 100, 1000, 818, 81, 898, 89, 0, 0};

        System.out.println(new Solution2().solution(numbers));
    }
}


class Solution { //11번 테스트 케이스 실패 [0,0,0] 일 경우 0으로 나와야 하는데 000나옴
    public String solution(int[] numbers) {
        String answer = "";
        String[] snum = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            snum[i] = numbers[i] + "";
        }
        Arrays.sort(snum, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        for (String i : snum) {
            answer += i;
        }


        return answer;
    }
}
class Solution2 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] snum = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            snum[i] = numbers[i] + "";
        }
        Arrays.sort(snum, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        for (String i : snum) {
            answer += i;
        }
        if (answer.charAt(0) == '0') { //처음에 Integer.parseInt()로 바꿨더니 범위 초과하는 거 있어서 이렇게 바꿈
            return "0";
        }

        return answer;
    }
}