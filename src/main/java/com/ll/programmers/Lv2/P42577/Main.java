package com.ll.programmers.Lv2.P42577;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(new Solution().solution(phone_book));
    }
}


class Solution{
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> phone = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            phone.put(phone_book[i], 0); //map key에다 다 저장
        }

        for(String n : phone_book) {
            for(int i = 1; i < n.length(); i++) {
                if(phone.containsKey(n.substring(0, i))) { // 반복문 돌리며 처음 숫자 119면 1,11,19 가 key에 존재하는지 확인 있으면 false
                    return false;
                }
            }
        }
        return answer;
    }
}
class Solution2{
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book, Comparator.comparingInt(String::length));
        for(int i = 0; i < phone_book.length; i++){
            for(int j = i+1; j < phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])){
                   return false;
                }
            }
        }
        return answer;
    }
}

