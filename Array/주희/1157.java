import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int start = 'A';
		int end = 'Z';
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = start; i < end+1; i++) {
			map.put((char)i, 0);
		}
		
		int max_num = -1;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++) {
			String x = Character.toString(str.charAt(i));
			char now = x.toUpperCase().charAt(0);
			map.replace(now, map.get(now)+1);
			max_num = Math.max(max_num, map.get(now));
		}
		
		Iterator<Character> keys = map.keySet().iterator();
		
		char answer = 'a';
		int cnt = 0;
		while (keys.hasNext()) {
			char key = keys.next();
			if(map.get(key) == max_num) {
				cnt++;
				answer = key;
			}
		}

		if(cnt > 1) {
			System.out.println("?");
		} else {
			System.out.println(answer);
		}
		
	}
	
}
