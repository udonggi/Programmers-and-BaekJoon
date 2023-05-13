package com.ll.programmers.Lv1.P12931;

public class Main {
public static void main(String[] args) {
        int n = 123;
        System.out.println(new Solution().solution(n));
    }

}

class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer += n % 10;
            if(n < 10) break;
            n = n / 10;
        }

        return answer;
    }
}
