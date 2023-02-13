package A;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println(" Enter String : ");
		String O = s.next();
		
		String rev = "";
		int l = O.length();
		int i = l - 1;
		while(i>=0)
		{
			rev = rev + O.charAt(i);
			i--;
		}
		System.out.println("Rev - "+ rev);
		if(O.equals(rev))
		{
			System.out.println("Palindrom");
	
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
