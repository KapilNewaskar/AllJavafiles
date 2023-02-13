package feb25;

public class NestedIf_using_OR_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentMarks = 101;
		
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
			if(studentMarks > 100 || studentMarks < 35 ) {
				System.out.println("Student Failed or Invalid marks");
			}
		}
		
	}

}
