

  class Solution {
    public int solution(int[][] sizes) {
                
        int rowmax = 0;
        int colmax = 0;
        int valmax = 0;
        int secondmax = 0;
        
        for(int[] row : sizes) {
        	rowmax = Math.max(rowmax,row[0]);
        	colmax = Math.max(colmax,row[1]);
        	secondmax = Math.max(secondmax,Math.min(row[1],row[0]));
        }
        
        valmax = Math.max(rowmax, colmax);
        
        
        return valmax*secondmax;
    }
}
