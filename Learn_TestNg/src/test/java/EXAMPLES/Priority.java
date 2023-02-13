package EXAMPLES;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 1)
	public void SignUp() {
		System.out.println("SignUp");
	}

	@Test(priority = 2)
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
