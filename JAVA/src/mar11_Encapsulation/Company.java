package mar11_Encapsulation;

public class Company {

	private String EmpId;
	private String EmpName;
	private String EmpAddres;
	private String EmpMobile;
	private String EmpDoB;
	
	public String getEmpId(){
		return EmpId;
	}
	
	public void setEmpId(String EmpId) {
		this.EmpId = "Employee Id is : "+EmpId;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	
	public void setEmpName(String EmpName) {
		this.EmpName= "Employee Name is : "+ EmpName;
	}
	public String getEmpAddres(){
		return EmpAddres;
	}
	
	public void setEmpAddres(String EmpAddres) {
		this.EmpAddres = "Employee Address is : " +EmpAddres;
	}
	public String getEmpMobile(){
		return EmpMobile;
	}
	
	public void setEmpMobile(String EmpMobile) {
		this.EmpMobile ="Employee Number is : " + EmpMobile;
	}
	public String getEmpDoB(){
		return EmpDoB;
	}
	
	public void setEmpDoB(String EmpDoB) {
		this.EmpDoB ="Employee DOB is : "+ EmpDoB;
	}
}
