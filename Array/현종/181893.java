package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Pro181893 {
    public static int[] solution(int[] arr, int[] query) {
        int[]           answer = {};
        Deque<Integer>  deque = new ArrayDeque<>();
        int             idx = 0;

        for (int i = 0; i < arr.length; i++) {
            deque.addLast(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            idx = query[i];
            int len = deque.size();
            if (i%2 == 0) { //even num
                for (int j=idx+1; j< len; j++){
                    deque.removeLast();
                }
            }
            else {          //odd num
                for (int j = 0; j < idx; j++) {
                    deque.removeFirst();
                }
            }
        }
        answer = new int[deque.size()];
        int ii = 0;
        for (int i : deque) {
            answer[ii++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};

        int[]ans = solution(arr, query);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
