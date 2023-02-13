package mar11_Interface_Ex;

public interface Office extends Emp, Emp2 {

	abstract void office();
	
	default void test() {
		System.out.println("hello");
	}
	
}
