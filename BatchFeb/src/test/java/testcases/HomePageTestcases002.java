package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTestcases002 extends TestBase {

	@Test
	void search1() {
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox(excelReader.getCellData("Sheet2", "SearchName", 2));
		homeObj.getSearchButton().click();
	}
	
	@Test
	void search2() {
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox(excelReader.getCellData("Sheet2", "SearchName", 3));
		homeObj.getSearchButton().click();
	}
	
	@Test
	void search3() {
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox(excelReader.getCellData("Sheet2", "SearchName", 4));
		homeObj.getSearchButton().click();
	}
	
}
