package com.ll.baekjoon.sliver.s1.B1931;

import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.add(new Meeting(s, e));
        }
        Collections.sort(list, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if (o1.end == o2.end) {
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        // 시작: 제일 끝나는 시간 빠른 거
        int num = list.get(0).end; // 이 숫자부터 시작
        int i = 1;
        int answer = 1;
        while (true) {
            //start가 num보다 크거나 같은 거 중에 다음거 바로 고르고 num 갱신
            if (list.get(i).start >= num) {
                num = list.get(i).end;
                answer++; // 회의 추가
            }

            //종료조건 : 현재(num) 기준으로 다음 start 없으면 종료, 마지막이면 종료
            if (i == list.size()-1) {
                break;
            }

            i++;

        }
        System.out.println(answer);
    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}