package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Ilistener.class})
public class Test1 {

	@Test
	public void Testmethod1() {
		System.out.println("Testmethod1");
	}

	@Test
	public void Testmethod2() {
		System.out.println("Testmethod2");
	}

	@Test
	public void Testmethod3() {
		System.out.println("Testmethod3");
	}

}
