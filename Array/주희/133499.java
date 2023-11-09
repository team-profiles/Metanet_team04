class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] twice = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] once = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < twice.length; j++) {
                babbling[i] = babbling[i].replace(twice[j], "1");
            }
            
            for(int j = 0; j < once.length; j++) {
                babbling[i] = babbling[i].replace(once[j], " ");
            }
            
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}
