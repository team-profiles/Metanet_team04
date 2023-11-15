class Solution {
    public int solution(String t, String p) {
        int cnt=0;
        for(int i=0; i<t.length()-p.length();i++){
          if(Integer.parseInt(t.substring(i,i+1))<=Integer.parseInt(p)) cnt++;
        
        }
        
        return cnt;
    }
}


