package com.ll.programmers.Lv0.P120806;

public class Main {
    public static void main(String[] args){

    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((0< num1 && num1 <=100) && (0< num2 && num2 <= 100)){
            answer = (int) ((num1 / (double)num2)*1000);
        }
        return answer;
    }
}
