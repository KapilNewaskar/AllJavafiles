package E_commerce_project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Test_002 extends Test_Base {

	@Test
	public void AddToCart() throws Exception {
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

		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"))"));

		int ProductCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

		for (int i = 0; i < ProductCount; i++) {
			String ProductName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i)
					.getText();

			if (ProductName.equalsIgnoreCase("Jordan Lift Off")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}

		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		String ProductResult = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		
		assertEquals(ProductResult, "Jordan Lift Off");
		
		
		Thread.sleep(5000);
	}
}
