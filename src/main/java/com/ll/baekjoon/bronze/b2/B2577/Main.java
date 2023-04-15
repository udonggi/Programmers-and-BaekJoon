package com.ll.baekjoon.bronze.b2.B2577;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> store = new HashMap<>();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String result = String.valueOf(A * B * C);
        for (int i = 0; i < 10; i++) {
            store.put((char) (i + '0'), 0);
        }
        for (int i = 0; i < result.length(); i++) {
            char n = result.charAt(i);
            switch (n) {
                case '0':
                    store.put('0', store.get('0') + 1);
                    break;
                case '1':
                    store.put('1', store.get('1') + 1);
                    break;
                case '2':
                    store.put('2', store.get('2') + 1);
                    break;
                case '3':
                    store.put('3', store.get('3') + 1);
                    break;
                case '4':
                    store.put('4', store.get('4') + 1);
                    break;
                case '5':
                    store.put('5', store.get('5') + 1);
                    break;
                case '6':
                    store.put('6', store.get('6') + 1);
                    break;
                case '7':
                    store.put('7', store.get('7') + 1);
                    break;
                case '8':
                    store.put('8', store.get('8') + 1);
                    break;
                case '9':
                    store.put('9', store.get('9') + 1);
                    break;
            }
        }
        Iterator<Integer> itr = store.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
