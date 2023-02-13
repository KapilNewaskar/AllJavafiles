package Tests;

import org.testng.annotations.Test;

public class Depends_on {

	@Test()
	public void Test1() {
		System.out.println("Test1");
		System.out.println(5/0);
	}

	@Test( alwaysRun = true)
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(dependsOnMethods = "Test1")
	public void Test3() {
		System.out.println("Test3");
	}
}
