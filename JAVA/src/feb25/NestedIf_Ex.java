package feb25;

public class NestedIf_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentMarks = 50;
		
		if(studentMarks >= 35 && studentMarks <= 100) {
			
			if(studentMarks >= 35 && studentMarks <=49) {
				System.out.println("Grade C");
			}
			else if(studentMarks >=50 && studentMarks <= 59) {
				System.out.println("Grade B");
			}
			else if(studentMarks >= 60 && studentMarks <= 100) {
				System.out.println("Grade A");
			}		
			
		}
		else {
			if(studentMarks > 100) {
				System.out.println("Invalid marks");
			} else {
				System.out.println("Fail");
			}
		}
		
	}

}
