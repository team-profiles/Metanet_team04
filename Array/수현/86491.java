class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = Math.max(sizes[0][0],sizes[0][1]);
        int min = Math.min(sizes[0][0],sizes[0][1]);
        for (int[] size : sizes){
            max = Math.max(max,Math.max(size[0], size[1]));
            min = Math.max(min,Math.min(size[0], size[1]));
        }
        return max*min;
    }
}
