package mar_9_final_ex;

final class Vignan {
	
	final String schoolName = "VignanGlobalHighSchool";
	
	final void display() {
		System.out.println("school name is " + schoolName);
	}
	
	void display2() {
		System.out.println("school name is " + schoolName);
	}
	
	void display3() {
		System.out.println("school name is " + schoolName);
	}
	
	public static void main(String[] args) {
		
		final String address = "Ameerpet";
		String phoneNumber = "987456123"; 
		System.out.println(address);
		System.out.println(phoneNumber);
		
		//address = "miyapur"; // user cannot change value
		phoneNumber = "9000000000";
		System.out.println(address);
		System.out.println(phoneNumber);
		
		
		Vignan obj = new Vignan();
		obj.display();
		obj.display2();
		obj.display3();
	}
	
}

