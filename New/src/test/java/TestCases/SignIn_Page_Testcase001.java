package TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;

public class SignIn_Page_Testcase001 extends TestBase {

	@Parameters({ "username", "password" })

	@Test
	void SignIn(String user, String pass) {

		Assert.assertEquals(SignInObj.getSignin().isEnabled(), true);

		SignInObj.getSignin().click();
		SignInObj.setUsername(user);
		SignInObj.setPassword(pass);
		SignInObj.getLogin().click();

	}

	@Test
	void SignIn() {

		Assert.assertEquals(SignInObj.getSignin().isEnabled(), true);

		SignInObj.getSignin().click();
		SignInObj.setUsername(excelreader.getCellData("Sheet1", "username", 2));
		SignInObj.setPassword(excelreader.getCellData("Sheet1", "password", 2));
		SignInObj.getLogin().click();

	}
}
