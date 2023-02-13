package Appium_Learing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Test_001 extends TestBase {

	@Test
	public void WifiTest() {

		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/button")).click();
		String ActualTitle = driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/head")).getText();
		Assert.assertEquals(ActualTitle, "Button");

		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/firstout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/secondout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/thirdout")).sendKeys("Test Pass");

	}

	@Test
	public void LongPressEx() throws Exception {
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/button")).click();
		String ActualTitle = driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/head")).getText();
		Assert.assertEquals(ActualTitle, "Button");

		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/firstout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/secondout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/thirdout")).sendKeys("TestPass");
		WebElement LongPress = driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/thirdout"));

		LongPressAction(LongPress);

		Thread.sleep(5000);
	}

	@Test
	public void DoubleTapEx() throws Exception {
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/button")).click();
//		String ActualTitle = driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/head")).getText();
//		Assert.assertEquals(ActualTitle, "Button");

		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/firstout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/secondout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/thirdout")).sendKeys("TestPass");
		WebElement DoubleTap = driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/thirdout"));

		DoubleTapAction(DoubleTap);

		Thread.sleep(5000);
	}
}
