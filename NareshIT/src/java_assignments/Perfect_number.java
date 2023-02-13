package java_assignments;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// To check given number is perfect or not

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scn.nextInt();
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				// System.out.println(i);
				sum = sum + i;				// 0+1 1+2 3+3
			}
		}

		if (sum == num) {
			System.out.println(num + " is perfect number");
		} else {
			System.out.println(num + " is not perfect number");
		}

	}

}
