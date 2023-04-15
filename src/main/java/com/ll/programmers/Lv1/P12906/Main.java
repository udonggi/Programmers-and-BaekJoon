package com.ll.programmers.Lv1.P12906;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};

        System.out.println(new Solution1().solution(arr));
        System.out.println(Arrays.toString(new Solution2().solution(arr)));
        System.out.println(Arrays.toString(new Solution3().solution(arr)));

    }

}

class Solution1 {
    public List<Integer> solution(int[] arr) {
        Queue<Integer> list = new LinkedList<>(); //큐에 arr 저장
        List<Integer> newList = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        newList.add(list.poll()); //일단 하나 빼서 저장

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (!newList.get(j).equals(list.remove())) { //다음거랑 다르면 리스트에 넣기, 같으면 안 넣고 넘어가기
                newList.add(arr[i]);
                j++;
            }
        }
        return newList;
    }

}

class Solution2 {
    public int[] solution(int[] arr) {
        Queue<Integer> list = new LinkedList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        newList.add(list.poll());

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (!newList.get(j).equals(list.remove())) {
                newList.add(arr[i]);
                j++;
            }
        }
        int[] answer = new int[newList.size()];

        for (int i = 0; i < newList.size(); i++) {
            answer[i] = newList.get(i);
        }

        return answer;
    }
}

class Solution3 {
    public int[] solution(int[] arr) {
        Queue<Integer> list = new LinkedList<>();
        list.add(arr[0]); //처음 숫자는 일단 넣기 (상관없으니)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {  //앞에 숫자와 현재 숫자가 다르면 넣기, 같으면 그냥 넘어가면 된다.
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { //큐에 있는거 배열에 넣기
            answer[i] = list.remove();
        }
        return answer;
    }
}


