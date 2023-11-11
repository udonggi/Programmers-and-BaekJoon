package com.ll.programmers.Lv2.B12941;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(new Solution().solution(A, B));
    }



}

class Solution
{
    public int solution(int []A, int []B)
    {

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[B.length-1-i];
        }

        return sum;
    }
}
