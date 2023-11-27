import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int s = commands[i][0];
            int e = commands[i][1];
            int k = commands[i][2];
            int[] tmp = new int[e-s+1];
            tmp = Arrays.copyOfRange(array,s-1,e);
            Arrays.sort(tmp);
            answer[i]=tmp[k-1];
        }
        
        return answer;
    }
}
