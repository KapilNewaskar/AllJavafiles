package feb25;

public class NotEqual_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String studentName = "Ram";

		if (studentName.equals("Ramu")) {
			System.out.println("PASS A");
		} else {
			System.out.println("abc");
		}

		if (studentName != "Ramu") {
			System.out.println("PASS B");
		}

	}

}
