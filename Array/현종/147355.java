
class Solution {
    public int solution(String t, String p) {
        int     t_len = t.length();
        int     p_len = p.length();
        String  str = null;
        long    temp = 0;
        long     target = Long.parseLong(p);
        int     cnt = 0;

        for (int i=0; i<t_len - p_len + 1; i++) {
            str = t.substring(i,i+p_len);
            temp = Long.parseLong(str);
            if (temp <= target)
                cnt++;
        }

        return cnt;
    }
}