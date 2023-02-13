package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.TestBase;

public class Home_Page_Testcase001 extends TestBase {

	@Test
	void search1() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test Started");
		Assert.assertEquals(homeObj.getSearchButton().isEnabled(), true);// if this is true then it will execute next
																			// line

		homeObj.getSearchBox().clear();
		logger.log(LogStatus.INFO, "cleared search field");
		homeObj.setSearchBox("T shirt");
		logger.log(LogStatus.INFO, "Searched T shirt");
		homeObj.getSearchButton().click();
		logger.log(LogStatus.INFO, "clicked on submit button");
		logger.log(LogStatus.PASS, TestcaseId);
	}

	@Test
	void search2() {
		String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test Started");
		homeObj.setSearchBox("shirt");
		homeObj.getSearchButton().click();
		logger.log(LogStatus.PASS, TestcaseId);
	}

	@Test
	void search3() {
		String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test Started");
		homeObj.getSearchBox().clear();
		homeObj.setSearchBox("jeans");
		homeObj.getSearchButton().click();
		logger.log(LogStatus.PASS, TestcaseId);
	}

}
