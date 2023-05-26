package com.ll.baekjoon.sliver.s5.B1316;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행문자 날려주기
        int answer = 0;

        for(int i = 0; i < N; i++){
            String word = sc.nextLine(); //단어 입력받기
            Map<Character, Integer> map = new HashMap(); //단어 찾기
            map.put(word.charAt(0), 1); //첫번째 문자 넣기
            for (int j = 0; j < word.length()-1; j++) {

                if (word.charAt(j) != word.charAt(j + 1)) { //다음에 나오는 단어와 다르다면 map에 넣는데 넣기전에 그 전에 넣어져 있었으면 그룹 단어 아니다.
                    if (map.containsKey(word.charAt(j + 1))) {
                        answer--;
                        break;
                    }
                    map.put(word.charAt(j + 1), 1);
                }
            }
            answer++;
        }

        System.out.println(answer);
    }
}