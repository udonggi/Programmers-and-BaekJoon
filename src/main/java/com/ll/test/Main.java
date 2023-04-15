package com.ll.test;


import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Map<String, String> 사람1 = new HashMap<>();
        사람1.put("이름", "홍길동");
        사람1.put("나이", "22");
        사람1.put("키", "170.5");
        Map<String, String> 사람2 = new HashMap<>();
        사람2.put("이름", "홍길순");
        사람2.put("나이", "25");
        사람2.put("키", "162.4");
        System.out.println(사람1);
        System.out.println(사람2);
    }
}

/*class Sol1 {

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<>();

        int i =0;
        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            al.add(num);
        }

        Collections.sort(al);

        StringBuilder sb = new StringBuilder();

        for (int number : al) {

            if (sb.isEmpty() == false) {
                sb.append(", ");
            }

            sb.append(number);
        }

        System.out.printf("입력한 숫자(오름차순) : %s\n", sb);
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}

class Sol2 {

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<>();

        int i =0;
        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            al.add(num);
        }

        String str = al
                .stream().sorted().map(e -> ""+e).collect(Collectors.joining(", "));

        System.out.printf("입력한 숫자(오름차순) : %s\n", str);
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}*/
