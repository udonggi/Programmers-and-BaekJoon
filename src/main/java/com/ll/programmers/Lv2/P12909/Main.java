package com.ll.programmers.Lv2.P12909;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        String s = "(()(";
        System.out.println(new Solution().solution(s));
    }
}


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> check = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){                 //스택에 ( 이거면 넣어두기
                check.push(s.charAt(i));
            }
            else{
                if(check.isEmpty()) return false;       // 스택에 '(' 없는데 ')' 들어오면 잘못된 것이므로 false
                check.pop();                            // 비어있지 않다면 들어있는 '(' 하나 pop
            }
        }
        if(!check.isEmpty()) return false;              // 괄호 갯수에 맞게 잘 넘어가서 비어있으면 true 스택에 남아있으면 false
        return answer;
    }
}