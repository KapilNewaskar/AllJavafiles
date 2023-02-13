package Appium_Learing;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Test_002 extends Test_Base1 {

	@Test
	public void DoubleTapEx() throws Exception {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement peoplesLongPress = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		LongPressAction(peoplesLongPress);

		String Title = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		assertEquals(Title, "Sample menu");
		assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).isDisplayed());

		Thread.sleep(5000);
	}
}
