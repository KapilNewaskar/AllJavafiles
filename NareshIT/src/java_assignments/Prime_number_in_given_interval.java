package java_assignments;

import java.util.Scanner;

public class Prime_number_in_given_interval {

	public static void main(String[] args) {

		int temp = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the interval to print prime numbers");
		System.out.println("From:");
		int from = scn.nextInt();
		System.out.println("To:");
		int to = scn.nextInt();

		for (int i = from; i <= to; i++) {

			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0 && i != 1) {
				System.out.println(i);
			} else {
				temp = 0;
			}
		}

	}

}
