import java.util.ArrayList;
import java.util.List;

class Solution {
    public Integer[] solution(int[] answers) {
        int count1= 0;
		int count2= 0;
		int count3= 0;
		int max_count = 0;
		List<Integer> list = new ArrayList<Integer>();
	
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == num1[i%5]) count1++;
		}	
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == num2[i%8]) count2++;
		}	
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == num3[i%10]) count3++;
		}
		
		max_count = Math.max(count3, Math.max(count1,count2));
		
		if(count1 == max_count) list.add(1);
		if(count2 == max_count) list.add(2);
		if(count3 == max_count) list.add(3);
        
		return list.toArray(new Integer[0]);
    }
}
