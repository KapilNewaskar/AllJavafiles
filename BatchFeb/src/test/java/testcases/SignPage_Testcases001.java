package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class SignPage_Testcases001 extends TestBase {

	@Test
	void signIn001() {
		homeObj.getSignInLink().click();
		
		Assert.assertEquals(signInObj.getButtonLogin().isEnabled(), true);
		
		signInObj.setEmailLogin("santosh@test.com");
		signInObj.setPasswdLogin("123456");
		signInObj.getButtonLogin().click();
	}
	
	@Test
	void signIn002() {
		homeObj.getSignInLink().click();
		Assert.assertEquals(signInObj.getButtonLogin().isEnabled(), true);
		signInObj.setEmailLogin("digitalcutlet@test.com");
		signInObj.setPasswdLogin("123456");
		signInObj.getButtonLogin().click();
		
	}
	
	@Test
	void createAccountTest001() {
		homeObj.getSignInLink().click();
		Assert.assertEquals(signInObj.getEmailCreate().isEnabled(), true);
		
		signInObj.setEmailCreate("santosh11@test.com");
		signInObj.getSubmitButtonCreateAccount().click();
		
	}
	
}
