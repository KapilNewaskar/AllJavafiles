package mar_8;

public class Emp {

	static int salary = 10000;
	
	int rollNo = 100;
	
	
	static void display() {
		System.out.println("salary is " + salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Emp.salary);	
		Emp.display();
		
		Emp obj = new Emp();
		System.out.println(obj.rollNo);
		
		System.out.println(obj.salary);
	}
	
	
	

}
