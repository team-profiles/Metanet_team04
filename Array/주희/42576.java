import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String c : completion) {
            if(!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c)+1);
        }
        for(String p : participant) {
            if(!map.containsKey(p)) {
                return p;
            }
            map.put(p, map.get(p)-1);
            if(map.get(p) == -1) {
                return p;
            }
        }
        return answer;
    }
}
