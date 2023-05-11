package com.ll.programmers.Lv3.P43238;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        int[] items = {7, 10};
        System.out.println(new Solution().solution(n, items));
    }
}


class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = 0;
        long left = 0;
        long right = (long)times[times.length-1] * n; //최대로 시작
        long mid = 0;

        long sum = 0;

        while(left <= right){ // right가 left와 같아지거나 left 보다 작아지면 그때 만나는 지점이 답
            mid = (left + right) / 2; // 중간값
            sum = 0;
            for(int i = 0; i < times.length; i++){
                sum += mid / times[i]; // mid 시간동안 각 심사관이 심사할 수 있는 사람 수 더한다.
            }
            if(sum >= n){ // n명 이상 심사하면 시간을 줄여야하므로 right = mid -1
                answer = mid;
                right = mid - 1;
            }else{ // n명 이하 심사하면 시간을 늘려야하므로 left = mid + 1
                left = mid + 1;
            }
        }

        return answer;
    }
}