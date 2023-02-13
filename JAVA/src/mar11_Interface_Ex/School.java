package mar11_Interface_Ex;

public interface School {
	
	abstract void bus();
	abstract void classes();
	abstract void teachers();
	abstract void students();
	
	default void headmaster() {
		System.out.println("HM is Shiva");
	}
	
}
