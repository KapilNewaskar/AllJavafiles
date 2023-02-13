package java_assignments;

import java.util.Scanner;

public class Factors_sum {

	public static void main(String[] args) {
		// Sum of factors of given number

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scn.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);

				sum = sum + i;
			}
		}
		System.out.println("Sum of the factor is: " + sum);
	}

}
