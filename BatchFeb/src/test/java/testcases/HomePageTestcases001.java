package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTestcases001 extends TestBase {

	@Test
	void search1() {
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox("T Shirt");
		homeObj.getSearchButton().click();
	}
	
	@Test
	void search2() {
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox("Jeans");
		homeObj.getSearchButton().click();
	}
	
	@Test
	void search3() {
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox("Shirt");
		homeObj.getSearchButton().click();
	}
	
}
