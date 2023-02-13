package mar25;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6 {
	@Test(priority=2)
	public void f() {
		System.out.println("I am from Test1");
	}

	@Test(priority=3)
	public void f2() {
		System.out.println("I am from Test2");
	}
	
	@Test(priority=1)
	public void f3() {
		System.out.println("I am from Test3");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am from Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am from After class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am from Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am from After Method");
	}
}
