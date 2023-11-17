class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left = 0;
        int right = 0;
        char[] arr = s.toCharArray();
        for(char x : arr) {
            if(x == '(') {
                left++;
            } else {
                right++;
            }
            // System.out.println(left + " " + right);
            if(right > left) {
                return false;
            }
        }
        if(right != left) {
            return false;
        }
        return answer;
    }
}
