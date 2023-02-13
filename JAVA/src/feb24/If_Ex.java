package feb24;

public class If_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentMarks = 100;
		
		if(studentMarks >= 35) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//
		String insName = "DigitalCutlet";
		
		if(insName.equals("DigitalCutlet")) {
			System.out.println("i am getting training in DC");
		} 
		else {
			System.out.println("i am not getting taining in DC");
		}
		
		//
		if(insName.contains("i")) {
			System.out.println("i am getting training in DC");
		} 
		else {
			System.out.println("i am not getting taining in DC");
		}
		
		//
		if(insName.equalsIgnoreCase("digitalcutlet")) {
			System.out.println("i am getting training in DC");
		} 
		else {
			System.out.println("i am not getting taining in DC");
		}
		
		if(insName.equals("DigitalCutlet")) {
			System.out.println("i am good");
		}else {
			System.out.println("i am not good");
		}
		
	}

}
