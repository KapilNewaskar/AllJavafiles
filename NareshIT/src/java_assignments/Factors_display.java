package java_assignments;

import java.util.*;

public class Factors_display {

	public static void main(String[] args) {
		// Factor of a given number

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scn.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
