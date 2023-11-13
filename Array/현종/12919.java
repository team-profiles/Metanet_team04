package org.example;

public class Pro12919 {
    public static String solution(String[] seoul) {
        int result = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                result = i;
        }
        return "김서방은 " + result + "에 있다";
    }

    public static void main(String[] args) {
        String[]    seoul = {"Jane", "Kim"};

        System.out.println(solution(seoul));
    }
}
