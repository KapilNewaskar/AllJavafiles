package A;

import java.util.Scanner;

public class User_Scanner {

	public static void main(String[] args) {
		int i;
		String s;
		float f;
		double d;
		short sw;
		char c;
		System.out.println(" Enter values :");
		
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter Integer :");
		i = scn.nextInt();
		System.out.println(" Enter String :");
		s = scn.next();
		
		System.out.println(" Enter float :");
		f = scn.nextFloat();
		System.out.println(" Enter double :");
		d = scn.nextDouble();
		System.out.println(" Enter short :");
		sw = scn.nextShort();
		
		System.out.println(i + s + f +d + sw);
		
		

	}

}
