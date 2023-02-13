package mar_7;

public class X extends A {
	
	int adminSalary = 5000;
	String dept = "Admin Dept";
	
	void displayAdminInfo() {
		System.out.println("Salary of Admin is " + adminSalary);
		System.out.println("Dept is " +  dept);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj = new X();
		obj.displayOfficeName();
		
		obj.displaySalary();
		System.out.println(obj.adminSalary);
		obj.displayAdminInfo();
	}

}
