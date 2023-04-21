package com.ll.programmers.Lv2.P42885;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[]{40, 50, 20, 100, 10};
        int limit = 100;
        System.out.println(new Solution().solution(people, limit));
    }
}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int num = 0;
        int num_last = people.length - 1;
        Arrays.sort(people);
        while (true) {
            if (num == num_last) { //두 포인터에서 만나면 구명보트 하나 태우고 종료
                answer++;
                break;
            }

            int sum = people[num] + people[num_last];

            if (sum > limit) { // 무게제한 초과하면  맨 뒤에 사람만 보내기
                num_last--;
                answer++;
            } else { //초과 안하면 2명 태우고 보내기
                answer++;
                if (num_last - num == 1) { //근데 남은 사람이 이제 2명뿐이면 종료
                    break;
                }
                num_last--;
                num++;
            }
        }

        return answer;
    }
}

class Solution1 { //하하.. 최대인원 2명이었다..
    public int solution(int[] people, int limit) {
        int answer = 0;
        int num = 0;
        Arrays.sort(people);
        Loop1:
        while (true) {
            int sum = 0;
            for (int i = 0; num < people.length; num++) {
                sum += people[num];
                if (sum > limit) {
                    answer++;
                    break;
                }

                if (num == people.length - 1) {
                    answer++;
                    break Loop1;
                }
            }
        }
        return answer;
    }
}