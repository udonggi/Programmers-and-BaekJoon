package com.ll.programmers.Lv2.P12911;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int count = s.replace("0", "").length();

        int num = Integer.parseInt(s, 2);

        while (true) {
            num++;
            String b = Integer.toBinaryString(num);
            int b_count = b.replace("0", "").length();
            if (count == b_count) {
                break;
            }
        }

        return num;
    }
}


class Solution2 {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int slen = s.length();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) {
                s = "10" + s.substring(1);
                break;
            }
            if(s.charAt(i) == '1' && s.charAt(i-1) == '0'){
                s = s.substring(0, i-1) + "10";

                if (s.length() != slen) {
                    int remain = slen - s.length();
                    s = s + "0".repeat(remain - count) + "1".repeat(count);
                }

                break;
            }

            if (s.charAt(i) == '1') {
                count++;
            }

        }



        return Integer.parseInt(s, 2);
    }
}
