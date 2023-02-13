package mar_4;

public class A {

	int salary = 10000;
	String officeName = "ABC Company";

	void displaySalary() {
		System.out.println("Salary is " + salary);
	}

	void displayOfficeName() {
		System.out.println("office name is " + officeName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A();
		obj.displaySalary();
		obj.displayOfficeName();

	}

}
