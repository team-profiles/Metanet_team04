class Solution {
    public boolean isPalindrome(int x) {
        String origin = Integer.toString(x);
        StringBuffer sb = new StringBuffer(origin);
        String reversedStr = sb.reverse().toString();
        return origin.equals(reversedStr) ? true : false;
    }
}
