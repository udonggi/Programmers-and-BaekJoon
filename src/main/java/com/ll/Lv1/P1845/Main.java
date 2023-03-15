package com.ll.Lv1.P1845;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        int[] nums = {3,3,3,2,2,2};
        System.out.println(new Solution().solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {
        Map<Integer,Integer> po = new HashMap<>();
        int answer = 0;
        int n = nums.length/2;

        for(int i : nums){
            if(po.containsKey(i)){
                po.replace(i, po.get(i)+1);
            }
            po.put(i, 1);
        }
        if(po.size() < n){
            return po.size();
        }
        else {
            return n;
        }
    }
}
