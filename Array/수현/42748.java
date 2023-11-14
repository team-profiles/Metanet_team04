import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 
        for (int c=0;c<commands.length;c++){
            int i=commands[c][0];
            int j=commands[c][1];
            int idx=commands[c][2];
            int cnt = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int k=i-1;k<j;k++){
                cnt++;
                arr.add(array[k]);
            }
            Collections.sort(arr);
            answer[c] = (arr.get(idx-1));
        }
        return answer;
    }
}

// 최적화
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 
        for (int c=0;c<commands.length;c++){
            int[] arr = Arrays.copyOfRange(array, commands[c][0]-1,commands[c][1]);
            Arrays.sort(arr);
            answer[c] = arr[(commands[c][2]-1)];
        }
        return answer;
    }
}
