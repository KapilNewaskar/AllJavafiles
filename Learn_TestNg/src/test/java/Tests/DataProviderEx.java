package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx {
//
	//
	@Test(dataProvider = "getdata", dataProviderClass = ExcelDataProvider.class)
	public void Test_Google(String username, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

		Thread.sleep(5000);
		driver.quit();
	}

//	@DataProvider(name = "LoginData")
//	public Object[][] LoginInfo() {
//
//		Object[][] data = new Object[2][2];
//		data[0][0] = "Admin";
//		data[0][1] = "admin123";
//
//		data[1][0] = "Admin2";
//		data[1][1] = "admin1234";
//
//		return data;
//	}
}
