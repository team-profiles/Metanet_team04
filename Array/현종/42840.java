/*
* 1. 문제유형
* 2. 알고리즘
*
* 3. 자료구조
*       arraylist
* 4. 구현전략
*
*
*
*
* */



package cote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class test {
    public static ArrayList<Integer> student1(int len) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < (len / 5) + 1; i++) {
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
        }
        while (list.size() != len) {
            list.remove(list.size()-1);
        }
        return list;
    }

    public static ArrayList<Integer> student2(int len) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < (len / 8) + 1; i++) {
            list.add(2);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2);
            list.add(4);
            list.add(2);
            list.add(5);
        }
        while (list.size() != len) {
            list.remove(list.size()-1);
        }
        return list;
    }

    public static ArrayList<Integer> student3(int len) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < (len / 10) + 1; i++) {
            list.add(3);
            list.add(3);
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(4);
            list.add(4);
            list.add(5);
            list.add(5);
        }
        while (list.size() != len) {
            list.remove(list.size()-1);
        }
        return list;
    }


    public  static int[] solution(int[] answers) {
        int                             len = answers.length;
        ArrayList<Integer>              list1 = student1(len);
        ArrayList<Integer>              list2 = student2(len);
        ArrayList<Integer>              list3 = student3(len);
        ArrayList<ArrayList<Integer> >  lists = new ArrayList<>();
        TreeMap<Integer, Integer>       map = new TreeMap<>();
        int                             max = 0;
        int[]                           answer;
        int                             cnt = 0;

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        for (int i = 0; i < 3; i++) {
            cnt = 0;
            for (int j = 0; j < len; j++) {
                if (answers[j] == lists.get(i).get(j))
                    cnt++;
            }
            map.put(i+1, cnt);
        }
        for (int i : map.keySet()) {
            if (max < map.get(i))
                max = map.get(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == max)
                result.add(i);
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int[] arr = {1,3,2,4,2};
        int[] answer;
        answer = solution(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.println("i = " + answer[i]);
        }
    }
}
