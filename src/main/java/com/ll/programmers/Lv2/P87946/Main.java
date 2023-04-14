package com.ll.programmers.Lv2.P87946;

public class Main {
    public static void main(String[] args) {
        int dungeons[][] = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(new Solution().solution(80, dungeons));

    }
}

// 순열 활용 dfs 라고 생각하면 될 것 같다.
// 재귀호출을 사용할때 방문 된 것을 체크할 것이 필요해 static으로 변수를 만들었습니다.
// 피로도 k 와 던전 그리고 카운트하는데 필요한 0을 넣어줬다.
// 체크하는데 만약 방문하지 않았고 피로도에 만족하면 들어가서 방문했다고 체크

class Solution {
    static int answer = 0;
    static int check[];

    public int solution(int k, int[][] dungeons) {
        check = new int[dungeons.length];
        permutation(k, dungeons, 0);
        return answer;
    }

    public void permutation(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (check[i] != 1 && k >= dungeons[i][0]) { //최소 피로도에 만족하는지 , 방문했는지 체크
                check[i] = 1;
                permutation(k - dungeons[i][1], dungeons, cnt + 1); // 사용한 피로도 빼서 재귀호출
                check[i] = 0;
            }
        }
        if (answer < cnt) {
            answer = cnt;
        }

    }
}