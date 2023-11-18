import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> a = new ArrayList<>();
        int[] std1 = {1,2,3,4,5};
        int[] std2 = {2,1,2,3,2,4,2,5};
        int[] std3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] arr = {0,0,0};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == std1[i % 5]) arr[0]++;
            if(answers[i] == std2[i % 8]) arr[1]++;
            if(answers[i] == std3[i % 10]) arr[2]++;
        }
        int max_num = -1;
        for(int x : arr) {
            if(x > max_num) {
                max_num = x;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max_num) {
                a.add(i+1);
            }
        }
        int[] answer = new int[a.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}
