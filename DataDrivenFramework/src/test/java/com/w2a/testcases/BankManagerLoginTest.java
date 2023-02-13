package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {

		log.debug("Inside Login Test");
		driver.findElement(By.xpath(OR.getProperty("BankMangLogBtn"))).click();

		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("CustomerLoginBtn"))), "Login not successful");

		Thread.sleep(3000);

		log.debug("Login Succesfully Executed");
	}

}
