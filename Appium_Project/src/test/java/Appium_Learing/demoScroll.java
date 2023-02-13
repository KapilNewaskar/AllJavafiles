package Appium_Learing;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class demoScroll extends Test_Base1 {

	@Test
	public void ScrollTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		//ScrollToEnd();
	}
}
