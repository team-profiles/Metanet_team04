package kr.or.kosa;

import java.util.Scanner;

public class Temp {
	public void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int		result = 0;
		int		x = Integer.parseInt(sc.nextLine());
		int		y = Integer.parseInt(sc.nextLine());
		
		if (x>0) {
			if (y>0)
				result = 1;
			else
				result = 4;
		}
		else {
			if (y>0)
				result = 2;
			else
				result = 3;
		}
		System.out.println(result);
	}

}