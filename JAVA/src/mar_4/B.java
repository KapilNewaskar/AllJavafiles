package mar_4;

public class B extends A {
	
	String dept = "Teacher";
	int bonus = 2000;
	
	void displayDept() {
		System.out.println("dept is " + dept);
	}
	
	void displayBonus() {
		System.out.println("bonus amount is " + bonus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.displayDept();
		obj.displayBonus();
		
		
		obj.displaySalary();
		obj.displayOfficeName();
	}

}
