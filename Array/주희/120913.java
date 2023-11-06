class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()-1) / n + 1];
        for(int i = 0; i < answer.length; i++) {
           if(my_str.length() >= n) {
               answer[i] = my_str.substring(0, n);
               my_str = my_str.substring(n);
           } else {
               answer[i] = my_str;
           }
        }
        return answer;
    }
}
