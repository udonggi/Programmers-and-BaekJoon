package com.ll.programmers.Lv1.P42862;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = new int[]{2,3,4};
        int[] reserve = new int[]{1,2,3};

        System.out.println(new Solution().solution(n,lost, reserve));

    }
}



class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < n; i++) {
            student[i] = 1;
        }
        for (int i = 0; i < lost.length; i++) {
            student[lost[i]-1] = 0;
        }
        for (int i = 0; i < reserve.length; i++) {  //맨 앞은 자기 자신과 뒷번호만 가능 즉 앞 번호 체크하면 안된다 , 맨 뒷사람은 자기 자신과 앞번호만 가능 즉 뒷 번호 체크하면 x

            if(Arrays.binarySearch(lost, reserve[i]) >= 0 ){ // 자기 자신 (binarySearch는 없으면 음수반환)
                student[reserve[i]-1] = 1;
                continue;
            }
            if (reserve[i] != 1 && student[reserve[i] - 2] == 0) { //앞 번호 체크
                student[reserve[i] - 2] =1;
                continue;
            }
            if (reserve[i] != n && student[reserve[i]] == 0) { // 뒷 번호 체크
                student[reserve[i]] = 1;
            }
        }

        for (int i : student) {
            answer += i;
        }

        return answer;
    }
}