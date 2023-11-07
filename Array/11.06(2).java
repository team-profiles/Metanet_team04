package pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice2 {
	public static String[] solution(String my_str, int n) {
		
		
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            int endIndex = Math.min(i + n, my_str.length());
            String substring = my_str.substring(i, endIndex);
            result.add(substring);
        }
        
        String[] resultArray = result.toArray(new String[0]);
        return resultArray;
    }
}
