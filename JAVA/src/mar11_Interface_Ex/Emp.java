package mar11_Interface_Ex;

public interface Emp {

	abstract void salary();
	
	default void dept() {
		System.out.println("Dept is Admin");
	}
	
	public static void main(String[] args) {
	
		
	}
	
}

