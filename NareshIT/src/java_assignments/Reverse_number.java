package java_assignments;

import java.util.*;

public class Reverse_number {

	public static void main(String[] args) {
		//Display reverse of a given number

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any digits : ");
		int digit = scn.nextInt();

		while (digit > 0) {
			int x = digit % 10;
			System.out.print(x + " ");
			digit = digit / 10;
		}

	}

}
