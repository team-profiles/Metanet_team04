import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_h = 0;
        int max_w = 0;

        for(int i = 0; i < sizes.length; i++) {
            int h = Math.max(sizes[i][0], sizes[i][1]);
            int w = Math.min(sizes[i][0], sizes[i][1]);
            max_h = Math.max(max_h, h);
            max_w = Math.max(max_w, w);
        }
        return max_h*max_w;
    }
}
