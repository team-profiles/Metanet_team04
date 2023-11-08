class Solution {
    public int solution(String myString, String pat) {
int answer = 0;

        myString = myString.replace("A","C");
        myString = myString.replace("B","D");
        myString = myString.replace("C","B");
        myString = myString.replace("D","A");
        
        System.out.println(myString);
        
        int n = pat.length();
        for(int i=0; i<myString.length()-n+1; i++) {
        	if(myString.substring(i,i+n).equals(pat)) {
        		answer = 1;
            	break;	
        	}
        }
        
        return answer;
    }
}
