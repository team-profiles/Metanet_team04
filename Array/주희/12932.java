class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int[] answer = new int[str.length()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[answer.length-1-i] - '0';
        }
        return answer;
    }
}
