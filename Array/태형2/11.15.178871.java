import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<Integer, String> ranks = new HashMap<Integer, String>();
        Map<String,Integer> names = new HashMap<String,Integer>();
        for(int i = 0; i<players.length; i++) {
        	ranks.put(i, players[i]);
            names.put(players[i],i);
        }
        
        for(String name: callings){
            int chaser = names.get(name);
            int target = chaser-1;
            String target_name = ranks.get(target);
            
            ranks.put(target, name);
            ranks.put(chaser, target_name);
            names.put(name,target);
            names.put(target_name,chaser);
        }
        
        for(Entry<Integer,String> s : ranks.entrySet()) {
        	answer[s.getKey()] = s.getValue();
        }
        
        return answer;
    }
}
