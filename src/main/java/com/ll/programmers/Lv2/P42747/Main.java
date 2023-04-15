package com.ll.programmers.Lv2.P42747;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] citations = new int[]{5, 100, 102, 101};
        System.out.println(new Solution().solution(citations));


    }
}


class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 어차피 최대 길이를 넘을 수 없다.
            if (citations[i] >= h) { // h번 이상 인용된 논문이 h편 이상이라는 조건을 만족하면 h를 반환 왜냐하면 맨 앞에는 일단 h개 만족 그 다음 인덱스는 h-1 이상을 만족하면 조건에 만족한다.
                answer = h;
                break;
            }
        }
        return answer;
    }
}