package java_assignments;

import java.util.*;

public class Prime_number_OR_Not {

	public static void main(String[] args) {
		// Display number is prime or not

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scn.nextInt();
		int temp = 0;

		for(int i=2;i<num;i++) {
			if(num%i==0) {
				temp = temp+1;
			}
		}
		if(temp==0 && num!=1) {
			System.out.println(num + " is prime number");
		}
		else {
			System.out.println(num + " is not prime number");
		}

	}
}
