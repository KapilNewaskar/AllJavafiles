package java_assignments;

import java.util.*;

public class Sum_of_digits {

	public static void main(String args[]) {
		//Display sum of the given digits
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter digit number : ");
		int digit = scn.nextInt();
		int sum = 0;

		while (digit > 0) {

			int i = digit % 10;

			sum = i + sum;
			digit = digit / 10;
		}

		System.out.println("Sum of the digits: " + sum);

	}
}
