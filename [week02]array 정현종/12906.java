import java.util.*;


public class Solution {
    public int[] solution(int []arr) {
        int len = arr.length;
        int bef = 0;
        int cur = 0;
        List<Integer> answerList = new ArrayList<>();

        answerList.add(arr[0]);
        for (int i = 1; i < len; i++) {
            cur = arr[i];
            bef = arr[i - 1];
            if (cur != bef) {
                answerList.add(cur);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    
}