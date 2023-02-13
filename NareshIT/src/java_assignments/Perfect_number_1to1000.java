package java_assignments;

public class Perfect_number_1to1000 {

	public static void main(String[] args) {
		// Display perfect number from 1 to 1000

		System.out.println("The perfect numbers between 1 and 1000 are:");

		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			
			if(sum==i) {
				System.out.println(i);
			}
		}

	}

}
