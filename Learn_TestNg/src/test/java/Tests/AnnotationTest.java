package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class AnnotationTest {

	@Test
	public void Test1() {
		System.out.println("I am fom Test1");
	}

	@BeforeSuite
	public void Beforesuite() {
		System.out.println("I am fom before suite");
	}

	@AfterSuite
	public void Aftersuite() {
		System.out.println("I am fom After suite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("I am fom before Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("I am fom After Test");
	}

	@BeforeMethod
	public void Beforemethod() {
		System.out.println("I am fom before method");
	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("I am fom After method");
	}

	@BeforeClass
	public void Beforeclass() {
		System.out.println("I am fom before class");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("I am fom After class");
	}

}
