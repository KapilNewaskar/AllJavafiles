package E_commerce_project;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IDataProvidable;

import io.appium.java_client.AppiumBy;

public class Test_004 extends Test_Base {

	@Test
	public void SumOfValueOfProduct() throws Exception {
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

		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();

		List<WebElement> productPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		int count = productPrices.size();
		Double totalSum = 0.0;

		for (int j = 0; j < count; j++) {

			String AmountString = productPrices.get(j).getText();
			Double price = getFormattedAmount(AmountString);
			totalSum = totalSum + price;

		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		String DisplaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		Double DisplayFormattedSum = getFormattedAmount(DisplaySum);
		assertEquals(totalSum, DisplayFormattedSum);
		
		WebElement longPress= driver.findElement(By.xpath("//android.widget.TextView[@text='Please read our terms of conditions']"));
		LongPressAction(longPress);
		
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	
		Thread.sleep(5000);
		
		Set<String> contexts = driver.getContextHandles();
		for (String ContextName : contexts) {
			System.out.println(ContextName);
		}
		
	}
}
