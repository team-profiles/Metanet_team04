package backjoon;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int		n=0;
		
		n = Integer.parseInt(sc.nextLine());
		for (int i=1; i<=n; i++) {
			for (int j=0;j<n-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i -1; j++) {
				System.out.print("*");
			}
			for (int j=0;j<n-i; j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}