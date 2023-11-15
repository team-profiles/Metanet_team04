import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String participantName : participant) {
            map.put(participantName, map.getOrDefault(participantName, 0) + 1);
        }

        for (String completedParticipant : completion) {
            map.put(completedParticipant, map.get(completedParticipant) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return ""; 
    }
}
