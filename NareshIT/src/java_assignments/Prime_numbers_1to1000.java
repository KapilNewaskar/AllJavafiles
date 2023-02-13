package java_assignments;

public class Prime_numbers_1to1000 {

	public static void main(String[] args) {
		// Display prime number from 1 to 1000

		System.out.println("Prime numbers from 1 to 1000");

		int temp = 0;

		for (int i = 1; i <= 1000; i++) {

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
