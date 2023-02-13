package Appium_Learing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragAndDrop extends Test_Base1 {

	@Test
	public void DragAndDropTest() throws Exception {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
//		((JavascriptExecutor)driver).executeScript("mobile: dragGesture", ImmutableMap.of(
//				"elementId",((RemoteWebElement)source).getId(),
//				"endX", 650,
//				"endY", 580
//				));
		
		DragAndDropAction(source, 650, 580);
		
		 Thread.sleep(5000);
		 String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		 assertEquals(result, "Dropped!");
		 

	}
}
