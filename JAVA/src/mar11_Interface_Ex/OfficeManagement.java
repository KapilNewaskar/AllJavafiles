package mar11_Interface_Ex;

public class OfficeManagement implements Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OfficeManagement obj = new OfficeManagement();

		obj.salary();

	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary is 10000");
	}

	@Override
	public void salary2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dept2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void office() {
		// TODO Auto-generated method stub

	}

}
