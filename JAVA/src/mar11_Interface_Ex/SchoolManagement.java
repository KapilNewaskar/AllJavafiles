package mar11_Interface_Ex;

public class SchoolManagement implements School  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolManagement obj = new SchoolManagement();
		obj.teachers();
		obj.students();
		obj.bus();
		obj.classes();
		obj.headmaster();
	}

	@Override
	public void bus() {
		// TODO Auto-generated method stub
		System.out.println("3 bus");
	}

	@Override
	public void classes() {
		// TODO Auto-generated method stub
		System.out.println("10 rooms of classes");
	}

	@Override
	public void teachers() {
		// TODO Auto-generated method stub
		System.out.println("20 teachers");
	}

	@Override
	public void students() {
		// TODO Auto-generated method stub
		System.out.println("40 studetns");
	}

}
