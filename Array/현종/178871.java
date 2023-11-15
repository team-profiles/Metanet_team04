import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerIndex = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerIndex.put(players[i], i);
        }
        for (String calling : callings) {
            int index = playerIndex.get(calling);
            if (index > 0) {
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
                playerIndex.put(players[index], index);
                playerIndex.put(players[index - 1], index - 1);
            }
        }
        return players;
    }
    
}