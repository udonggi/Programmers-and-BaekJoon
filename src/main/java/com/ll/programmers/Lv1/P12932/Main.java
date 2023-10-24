package com.ll.programmers.Lv1.P12932;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(new Solution().solution(n));
        StringJoiner sj = new StringJoiner(",", "a", "b");
        sj.add("abc");
        System.out.println(sj);
    }

}

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int count = 0;
        for(int i = s.length()-1; i >= 0; i-- ){
            answer[count] = s.charAt(i);
            count++;
        }

        return answer;
    }
}
