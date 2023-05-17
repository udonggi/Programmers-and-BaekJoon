package com.ll.programmers.Lv1.P12931;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> list = new ArrayList<>();
        list.stream().filter(i -> i == 1).collect(Collectors.toList());

        return answer;
    }
}
