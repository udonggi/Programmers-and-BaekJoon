package com.ll.programmers.Lv1.P42576;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] p = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] s = new String[]{"stanko", "ana", "mislav"};

        String a = new Solution().solution(p, s);
        System.out.println(a);
    }
}


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> p = new HashMap<>();
        for (String per : participant) {
            if (p.containsKey(per)) {
                p.replace(per, p.get(per) + 1);
                continue;
            }
            p.put(per, 1);
        }

        for (String per : completion) {
            if (p.containsKey(per)) {
                p.replace(per, p.get(per) - 1);
            }
        }

        for (String key : p.keySet()) {
            if (p.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (participant[i].equals(completion[i]) == false) {
                return participant[i]; // 정렬 후 다른 거 있으면 그 사람만 completion에 없음
            }
        }
        return participant[participant.length - 1]; //비교했는데 위 반복문에서 안나오면 마지막 사람이 completion에 없다는 의미
    }
}


class Solution3 {
    public String solution(String[] participant, String[] completion) {
        Map<Integer, String> p = new HashMap<>();
        Map<Integer, String> copy = new HashMap<>();
        String answer = "";
        int person = 1;
        for (String per : participant) {
            p.put(person, per);
            copy.put(person, per);
            person++;
        }
        for (int i = 1; i < p.size() + 1; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (p.get(i).equals(completion[j])) {
                    copy.remove(i);
                    completion[j] = "";
                    break;
                }
                if (j == completion.length - 1) {
                    return p.get(i);
                }
            }
        }
        Iterator<String> iter = copy.values().iterator();
        while (iter.hasNext()) answer = iter.next();
        return answer;
    }
}


//      List<String> a = Arrays.stream(participant).filter(e -> !e.contains(completion[0])).filter(e->!e.contains(completion[1])).toList();
