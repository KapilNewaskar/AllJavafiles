package java_assignments;

import java.util.Scanner;

public class Perfect_number_in_given_interval {

	public static void main(String[] args) {
		// Display perfect number in given interval

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number from: ");
		int from = scn.nextInt();
		System.out.println("Enter number to: ");
		int to = scn.nextInt();

		for (int i = from; i <= to; i++) {

			int sum = 0;

			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}

	}

}
