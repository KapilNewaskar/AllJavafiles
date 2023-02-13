package mar_8;

public class This_Ex {
	
	int salary = 10000;
	String dept = "Admin";
	
	void display() {
		System.out.println("Salary is " + salary);
		System.out.println("Dept is " + dept);
	}
	
	void abc() {
		this.display();
		this.display2();
		this.display3(15000, "Teacher");
	}
	
	void display2() {
		System.out.println("Salary is " + this.salary);
		System.out.println("Dept is " + this.dept);
	}
	
	void display3(int salary, String dept) {
		System.out.println("Salary is " + this.salary);
		System.out.println("Dept is " + this.dept);
		
		System.out.println("Salary is " + salary);
		System.out.println("Dept is " + dept);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Ex obj = new This_Ex();
		obj.abc();
	}
	
	This_Ex(){
		System.out.println("hello");
	}

}
