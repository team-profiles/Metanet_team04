class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if (my_string.charAt(0)==is_prefix.charAt(0) && my_string.length() >= is_prefix.length()) {
        	for (int i = 1; i < is_prefix.length(); i++) {
				if (my_string.charAt(i)!=is_prefix.charAt(i)) {
					answer = 0;
				} else {
					answer = 1;
				}
			}
		}
        
        
        return answer;
    }
}
