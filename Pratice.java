package pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice {

	public static int[] reversetoArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] reversedArray = reversetoArray(n);
        
        System.out.print("[");

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
            if (i < reversedArray.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

}
