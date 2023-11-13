class Solution {
    public String solution(String[] seoul) {
        int answer = 0;
        for(String s: seoul){
            if (s.equals("Kim")){
                return "김서방은 "+ answer +"에 있다";
            }
            answer++;
        }
        return "";
        
    }
}
