package E_commerce_project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Test_001 extends Test_Base {

	@Test(priority = 1)
	public void Login() throws Exception {
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belarus\"))"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Belarus']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Kapil Newaskar");
		driver.hideKeyboard();
		
		String Gender = "Male";

		if (Gender.equals("Male")) {
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		} else {
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		}

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void InvalidLogin() throws Exception {
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belarus\"))"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Belarus']")).click();
		
		String Gender = "Male";

		if (Gender.equals("Male")) {
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		} else {
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		}

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String ToastMessage = driver.findElement(By.xpath("//(android.widget.Toast)[1]")).getAttribute("name");
		
		assertEquals(ToastMessage, "Please enter your name");
		
		Thread.sleep(5000);
	}
}
