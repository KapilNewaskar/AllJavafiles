package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.TestBase;

public class SignPage_Testcases002 extends TestBase {
	
	@Test
	void signIn001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test started");
		
		homeObj.getSignInLink().click();
		logger.log(LogStatus.INFO, "Clicked on the signInLink");
		
		Assert.assertEquals(signInObj.getButtonLogin().isEnabled(), true);
		
		logger.log(LogStatus.INFO, "Enter username and password");
		signInObj.setEmailLogin(excelReader.getCellData("Sheet1", "username", 2));
		signInObj.setPasswdLogin(excelReader.getCellData("Sheet1", "password", 2));
		signInObj.getButtonLogin().click();
		
		Assert.assertEquals(myAccountObj.getSignOutlink().isEnabled(), true);
		logger.log(LogStatus.INFO, "Successfully logged into My Account page");
		
		logger.log(LogStatus.PASS, TestcaseId);
	}
	
	@Test
	void signIn002() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test started");
		
		homeObj.getSignInLink().click();
		logger.log(LogStatus.INFO, "Clicked on the signInLink");
		
		Assert.assertEquals(signInObj.getButtonLogin().isEnabled(), true);
		
		logger.log(LogStatus.INFO, "Enter username and password");
		signInObj.setEmailLogin(excelReader.getCellData("Sheet1", "username", 3));
		signInObj.setPasswdLogin(excelReader.getCellData("Sheet1", "password", 3));
		signInObj.getButtonLogin().click();
		
		Assert.assertEquals(myAccountObj.getSignOutlink().isEnabled(), true);
		logger.log(LogStatus.INFO, "Successfully logged into My Account page");
		
		logger.log(LogStatus.FAIL, TestcaseId);
	}
	
	
	
}
