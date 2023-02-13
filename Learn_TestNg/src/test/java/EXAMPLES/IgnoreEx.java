
//To Ignore the package, we have to create package-info.java file and add Ignore tag above below pakage name
package EXAMPLES;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore -->> If we add Ignore here then it will ignore the class
public class IgnoreEx {

	@Test(priority = 1)
	public void SignUp() {
		System.out.println("SignUp");
	}

	@Ignore
	@Test
	public void Login() {
		System.out.println("Login");
	}

	@Test(priority = 3)
	public void SearchBus() {
		System.out.println("SearchBus");
	}

	@Test(priority = 4)
	public void BookBus() {
		System.out.println("BookBus");
	}

	@Test(priority = 5)
	public void GetTicket() {
		System.out.println("GetTicket");
	}

	@Test(priority = 6)
	public void LogOut() {
		System.out.println("LogOut");
	}

}
