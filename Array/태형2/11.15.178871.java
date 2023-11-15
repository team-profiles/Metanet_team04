import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<Integer, String> ranks = new HashMap<Integer, String>();
        for(int i = 0; i<players.length; i++) {
        	ranks.put(i, players[i]);
        }
        
        for(String name: callings){
        	for(int k : ranks.keySet()) {
            	if(ranks.get(k).equals(name)) {
            		ranks.put(k-1, name);
            		ranks.put(k, ranks.get(k-1));
            	}
            }
        }
        
        for(Entry<Integer,String> s : ranks.entrySet()) {
        	answer[s.getKey()] = s.getValue();
        }
        
        return answer;
    }
}
