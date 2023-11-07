import java.util.*;

class Solution {
    public static boolean isIn(int n, int[] delete_list) {
        for (int i=0; i<delete_list.length; i++) {
            if (n == delete_list[i])
                return (true);
        }
        return (false);
    }
    
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (isIn(arr[i], delete_list) == false)
                list.add(arr[i]);
        }
        
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
