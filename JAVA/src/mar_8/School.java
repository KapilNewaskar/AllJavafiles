package mar_8;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(student.salary);
		System.out.println(student.rollNo);

		student.display();
		
		student obj = new student();
		obj.display2();
	}

	static class student {
		static int salary = 10000;
		static int rollNo = 101;

		static void display() {
			System.out.println(student.salary);
			System.out.println(student.rollNo);
		}

		void display2() {
			System.out.println(student.salary);
			System.out.println(student.rollNo);
		}
	}

}
