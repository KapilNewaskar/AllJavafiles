package A;

import java.util.Scanner;

public class Number_Palindrom {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value:");
		int r, c=0;
		
		int n = s.nextInt();
		int temp=n;
		
		while(n>0)
		{
			r = n%10;
			c = (c * 10) + r;
			n = n/10;
			
		}
		System.out.println("Rev Number : "+c);
		if(temp==c)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}
			
	}

}
