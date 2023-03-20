package com.ll.programmers.Lv1.P12906;

import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{1,1,3,3,0,1,1};

        System.out.println(new Solution1().solution(arr));
        System.out.println(Arrays.toString(new Solution2().solution(arr)));
        System.out.println(Arrays.toString(new Solution3().solution(arr)));

    }

}

class Solution1 {
    public List<Integer> solution(int []arr) {
         Queue<Integer> list = new LinkedList<>();
         List<Integer> newList = new ArrayList<>();
         for(int i : arr){
             list.add(i);
         }
         newList.add(list.poll());

         int j = 0;
         for(int i = 1; i < arr.length; i++){
             if(!newList.get(j).equals(list.remove())){
                 newList.add(arr[i]);
                 j++;
             }
         }
         return newList;
     }

}

class Solution2 {
    public int[] solution(int []arr) {
         Queue<Integer> list = new LinkedList<>();
         List<Integer> newList = new ArrayList<>();
         for(int i : arr){
             list.add(i);
         }
         newList.add(list.poll());

         int j = 0;
         for(int i = 1; i < arr.length; i++){
             if(!newList.get(j).equals(list.remove())){
                 newList.add(arr[i]);
                 j++;
             }
         }
         int[] answer = new int[newList.size()];

         for(int i = 0; i < newList.size(); i++){
             answer[i] = newList.get(i);
         }

         return answer;
     }
}

class Solution3 {
    public int[] solution(int []arr) {
        Queue<Integer> list = new LinkedList<>();
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = list.remove();
        }
        return answer;
    }
}


