class Solution {
    public int solution(String myString, String pat) {
        String  str = "";
        int     len = pat.length();
        
        for (int i=0; i<myString.length(); i++){
            if (myString.charAt(i) == 'A')
                str += "B";
            else
                str += "A";
        }
        for (int i=0; i+len<= myString.length(); i++) {
            if (str.substring(i, i+len).equals(pat))
                return 1;
        }
        return 0;
    }
}