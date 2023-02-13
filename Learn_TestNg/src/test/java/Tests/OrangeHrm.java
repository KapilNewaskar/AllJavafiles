package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void InializeBrowser(@Optional("Chrome") String browserName) {
//If we dont give any browser name in xml then optional command launch optional browser as Chrome
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Browser not valid");
			break;
		}

		driver.manage().window().maximize();
	}

	@Parameters("sleepTime")
	@AfterTest
	public void TearDownBrowser(Long sleepTime) throws Exception {
		System.out.println(sleepTime);
		Thread.sleep(sleepTime);
		driver.quit();
	}

	@Parameters("url")
	@Test
	public void LaunchApp(String url) {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Parameters({ "username", "password" })
	@Test
	public void EnterLoginDetails(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

	}

	@Test
	public void NavigateToMyInfo() throws Exception {

		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(5000);
	}

	@Test
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.linkText("Personal Details")).isDisplayed());

	}

	@Test
	public void VerifyLoginPage() {
		WebElement element = driver.findElement(By.linkText("Dashboard"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());

	}

}
