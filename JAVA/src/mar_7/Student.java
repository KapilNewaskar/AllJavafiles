package mar_7;

public class Student {
	
	String name = "Pavan";
	int rollNo = 1919;
	
	Student(){
		System.out.println(name);
		System.out.println(rollNo);
	}
	Student(String student_name, int stu_rollNo){
		System.out.println(student_name);
		System.out.println(stu_rollNo);
	}
	Student(int student_rollNo, String StudentName){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		
		Student obj2 = new Student("Shiva", 10);
	}

}
