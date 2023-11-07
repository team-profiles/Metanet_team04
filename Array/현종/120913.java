
class Solution {
    public String[] solution(String my_str, int n) {
        int        len = my_str.length();
        int         num = (len + n - 1) / n; 
        String[]    answer = new String[num];
        
        for (int i = 0; i < num; i++) {
            int start = i * n;
            int end = Math.min((i + 1) * n, len); 
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}
