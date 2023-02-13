package mar_4;

public class Z {

	
	String ClasName = "Testing";
	int Amount = 10000;
	
	int Percentage = 100;
	
	void details() {
		
		System.out.println("Coursename is : "+ ClasName);
		System.out.println("Course Fees is : "+ Amount);
		
	}

	int result() {
		
		return Percentage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Z obj = new Z();
		
		obj.details();
		
		int getResult = obj.result();
		System.out.println("Result is : " + getResult);
		
		
		
	}

}
