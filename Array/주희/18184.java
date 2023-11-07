import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int x : arr) {
            nums.add(x);
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    nums.remove(Integer.valueOf(arr[i]));
                }
                    
            }
        }
        int[] answer = new int[nums.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = nums.get(i);
        }
        return answer;
    }
}
