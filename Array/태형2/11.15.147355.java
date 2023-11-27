
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        for(int i=0; i<t.length()-size+1; i++) {
        	if(Long.parseLong(t.substring(i, i+size))<=Long.parseLong(p)) {
        		answer+=1;
        	}
        }
        
        return answer;
    }
}
