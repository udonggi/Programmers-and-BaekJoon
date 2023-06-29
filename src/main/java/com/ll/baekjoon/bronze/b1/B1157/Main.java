package com.ll.baekjoon.bronze.b1.B1157;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
                continue;
            }
            map.put(c, 1);
        }

        int num = 0;
        int max = Collections.max(map.values());
        char answer = 'a';
        for (char c : map.keySet()) {
            if(map.get(c) == max){
                answer = c;
                num++;
            }
        }

        if(num > 1){
            System.out.println("?");
        } else{
            System.out.println(answer);
        }


    }


}