package backjoon;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade = 'a';
		int n = Integer.parseInt(sc.nextLine());
		
		if (90 <= n && n <= 100) {
			grade = 'A';
		}
		else if (80 <= n)
			grade = 'B';
		else if (70 <= n)
			grade = 'C';
		else if (60 <= n)
			grade = 'D';
		else
			grade = 'F';
		System.out.println(grade);
	}

}