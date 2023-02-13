package mar11_Encapsulation;

public class SchoolManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School obj = new School();

		obj.setNameOfTheSchool("Vignan School");
		System.out.println(obj.getNameOfTheSchool());

		obj.setHallTicketNo("046");
		System.out.println(obj.getHallTicketNo());

		obj.setNumber(111);
		System.out.println(obj.getNumber());

		obj.setnameOfStu("kk");
		System.out.println(obj.getnameOfStu());

		obj.setcollege("123");
		System.out.println(obj.getcollege());
	}

}