package pratice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		String s = sc.next();
		s = s.toUpperCase();
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		char[] s2 = s.toCharArray();
		
		for(char c : s2) {
			if(count.containsKey(Character.toString(c))) {
				count.put(Character.toString(c), count.get(Character.toString(c))+1);
			}
			else count.put(Character.toString(c), 1);
		}
		
		int check=0;
		int max_val = Collections.max(count.values());
		String answer=null;
		
		for(String key:count.keySet()) {
			if (count.get(key) == max_val) {
				if(2<=++check) break;
				answer = key;
			}
		}
		if(check>=2) System.out.println("?");
		else System.out.println(answer);
	}

}
