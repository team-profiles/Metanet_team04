class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] arr = myString.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'A') {
                arr[i] = 'B';
            } else if (arr[i] == 'B') {
                arr[i] = 'A';
            }
        }
        myString =  String.valueOf(arr);
        if(myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}
