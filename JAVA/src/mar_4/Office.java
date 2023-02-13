package mar_4;

public class Office {
	int salary = 10000;
	String officeName = "ABCD Company";
	
	void displayInfo() {
		System.out.println("Emp Salary : " + salary);
		System.out.println("Emp office name : " + officeName);
		display(); // a method can call another method
	}
	
	void display() {
		System.out.println("Welcome to company");
	}
	
	void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	void add2(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Office obj = new Office();
		obj.add();
		
		obj.add2(11, 22);
		obj.add2(999, 999);
		obj.add2(1000, 1500);
		obj.add2(1, 888);
		obj.displayInfo();
		System.out.println(obj.add3());
		
		int returnVlaue = obj.add4(111, 222);
		System.out.println(returnVlaue);
		
		String getCompanyName = obj.companyName();
		System.out.println("company name is : " + getCompanyName);
		
		int Multi =obj.multi(2, 3);
		System.out.println(Multi);
	}
	
	int add3() {
		return 10;
	}
	
	int multi(int x, int y) {
		int z = x*y;
		return z;
	
	}
	
	int add4(int a, int b) {
		int c = a + b;
		return c;
	}
	
	String companyName() {
		
		return officeName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
