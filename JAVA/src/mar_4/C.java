package mar_4;

public class C extends B {
	
	int rollNo = 10009;
	
	void displayRollNo() {
		System.out.println("Roll No is " + rollNo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.displayDept();
		obj.displayBonus();
		
		
		obj.displaySalary();
		obj.displayOfficeName();
		
		obj.displayRollNo();
	}

}
