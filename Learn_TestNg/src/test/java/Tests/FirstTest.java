package Tests;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void Test_Google() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);

		String ExpctedTitle = "Testing - Google Search";
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, ExpctedTitle);
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void Test_Facebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Testing.com", Keys.ENTER);
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")).click();
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")).click();

		SoftAssert softAssert = new SoftAssert();

		// VerifyTitle
		String ExpectedTitle = "Log in to Facebook";
		String ActualTitle = driver.getTitle();
		softAssert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");

		// VerifyUrl
		String ExpectedUrl = "https://www.facebook.com";
		String ActualUrl = driver.getCurrentUrl();
		softAssert.assertNotEquals(ActualUrl, ExpectedUrl, "Url is mismatched");

		// VerifyText
		String ExpectedText = "";
		String ActualText = driver.findElement(By.name("email")).getAttribute("value");
		softAssert.assertEquals(ActualText, ExpectedText, "Text is mismatched");

		// VerifyBorder
		String ExpectedBorder = "1px solid rgb(240, 40, 73)";
		String ActualBorder = driver.findElement(By.name("email")).getCssValue("Border");
		softAssert.assertEquals(ActualBorder, ExpectedBorder, "Username Border is mismatched");

		// VerifyErrorMessage
		String ExpectedErrorMessage = "The email address you entered isn't connected to an account. Find your account and log in.";
		String ActualErrorMessage = driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
		softAssert.assertEquals(ActualErrorMessage, ExpectedErrorMessage, "Error message is mismatched");

		driver.quit();
		softAssert.assertAll();
	}
}
