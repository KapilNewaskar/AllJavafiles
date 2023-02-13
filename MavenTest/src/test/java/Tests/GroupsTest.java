package Tests;

import org.testng.annotations.*;

@Test(groups = "all")
public class GroupsTest {

	@Test(groups = "sanity")
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(groups = { "sanity", "smoke" })
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(groups = { "sanity", "regression" })
	public void Test3() {
		System.out.println("Test3");
	}

}
