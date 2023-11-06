	class Solution {
	    public int[] solution(long n) {
	        String num = Long.toString(n);
	        int start = 0;
	        String[] arr = num.split("");
	        int[] arr2 = new int[arr.length];
	        
	        for (int i = arr.length-1; i >= 0; i--) {
				arr2[start] = Integer.parseInt(arr[i]);
				start++;
			}
	        
	        return arr2;
	    }
	}
