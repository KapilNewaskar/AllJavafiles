package mar_8_AccessModifies;

public class School_Surya {
	
	 private String playArea = "Garden";
	 private String parking = "2/4 wheeler";
	 private String classes = "I to X";
	 String address = "Miyapur";
	 public String pincode = "500049";
	 
	 
	public void display() {
		System.out.println("Play ares is " + playArea);
		System.out.println("Parking ares is " + parking);
		System.out.println("Classes ares is " + classes);
	}
	
	 private void display2() {
		System.out.println("address is " + address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School_Surya obj = new School_Surya();
		obj.display();
	}

}
