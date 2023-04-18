package com.ll.programmers.Lv2.P87377;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
        int[][] line = new int[][]{{1, -1, 0}, {2, -1, 0}};
        System.out.println(Arrays.toString(new Solution().solution(line)));
    }

}

class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        int[] x = new int[2];
        int[] y = new int[2];
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                int[] ints = line[i];
                int[] ints1 = line[j];
                int[] intersection = intersection(ints, ints1);
                if (intersection[0] < x[0]) {
                    x[0] = intersection[0];
                }
                if (intersection[0] > x[1]) {
                    x[1] = intersection[0];
                }
                if (intersection[1] < y[0]) {
                    y[0] = intersection[1];
                }
                if (intersection[1] > y[1]) {
                    y[1] = intersection[1];
                }
            }
        }
        answer = new String[y[1] - y[0] + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
            for (int j = 0; j < x[1] - x[0] + 1; j++) {
                answer[i] += ".";
            }
        }
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                int[] ints = line[i];
                int[] ints1 = line[j];
                int[] intersection = intersection(ints, ints1);
                answer[intersection[1] - y[0]] = answer[intersection[1] - y[0]].substring(0, intersection[0] - x[0]) + "*" + answer[intersection[1] - y[0]].substring(intersection[0] - x[0] + 1);
            }
        }

        return answer;
    }

    public int[] intersection(int[] ints, int[] ints1) {
        int[] answer = new int[2];
        int a = ints[0];
        int b = ints[1];
        int e = ints[2];
        int c = ints1[0];
        int d = ints1[1];
        int f = ints1[2];
        answer[0] = (b * f - e * d) / (a * d - b * c);
        answer[1] = (e * c - a * f) / (a * d - b * c);
        return answer;
    }
}
