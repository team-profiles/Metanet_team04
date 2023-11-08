class Solution {
    public int solution(String myString, String pat) {
        int answer =0;
        myString = myString.replace("A","0");
        myString = myString.replace("B","A");
        myString = myString.replace("0","B");
    
        if (myString.contains(pat)){
            return 1;
        }
        return 0;
    }
}
