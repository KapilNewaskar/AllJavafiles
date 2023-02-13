package mar11_Encapsulation;

public class EmployeeDetails extends Company{

	public static void main(String[] args) {
		
		EmployeeDetails obj = new EmployeeDetails();
		
		obj.setEmpId("K123");
		System.out.println(obj.getEmpId());		

		obj.setEmpName("Kapil Newaskar");
		System.out.println(obj.getEmpName());
		
		obj.setEmpAddres("Pune");
		System.out.println(obj.getEmpAddres());
		
		obj.setEmpMobile("8805734811");
		System.out.println(obj.getEmpMobile());

		obj.setEmpDoB("26/12/1996");
		System.out.println(obj.getEmpDoB());
	}

}
