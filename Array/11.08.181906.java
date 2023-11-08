import java.util.ArrayList;
import java.util.List;
class Solution {
  
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        List<String> parts = new ArrayList<String>();
        for(int i=0; i<my_string.length(); i++) {
        	String part = my_string.substring(0, i+1);
        	parts.add(part);
        }
        
        for(String part:parts) {
        	if (part.equals(is_prefix)==true){
                answer=1;
                break;
            }
        }
        
        return answer;
    }
}
