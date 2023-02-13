package mar_7;

public class Y extends A{
	
	int teacherSalary = 15000;
	String dept = "Teacher staff";
	
	void displayTeachInfo() {
		System.out.println("Teacher salary is " + teacherSalary);
		System.out.println("Dept is " + dept);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y obj = new Y();
		obj.displayOfficeName();
		obj.displayTeachInfo();
		
	}

}
