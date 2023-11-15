import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String player : callings) {
            int idx = map.get(player);
            String before = players[idx-1];

            map.put(players[idx-1], idx);
            map.put(players[idx], map.get(players[idx])-1);
            
            players[idx-1] = players[idx];
            players[idx] = before;
            
            
        }
        
        return players;
    }
}
