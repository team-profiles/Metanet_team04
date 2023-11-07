import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int last = arr[0];
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(last != arr[i]) {
                list.add(arr[i]);
                last = arr[i];
            } 
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
