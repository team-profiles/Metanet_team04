
class Solution {
    public boolean isPalindrome(int x) {
    
        int reverse = 0;
        int origin = x;

        if(x<0){
            return false;
        }

        while(x!=0){
            reverse = reverse*10+x%10;
            x/=10;
        }
        
        return origin==reverse;
    }
}
