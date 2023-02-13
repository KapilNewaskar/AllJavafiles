package mar_3;

public class Employee extends Office{

	int IDNo = 31;
	String officeName = "Infosys";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		Employee emp = new Employee();
		
		//System.out.println(rollNo);
		
		System.out.println(emp.IDNo);
		System.out.println(emp.officeName);
		
		emp.add2(1, 2);
		
	}

}
