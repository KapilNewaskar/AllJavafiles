package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocations {
//(invocationCount = 2)
	@Test
	public void randomurl() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://randomuser.me/");

		driver.findElement(By.xpath("//li[@data-title='Hi, My name is']")).click();
		System.out.println("User name :" + driver.findElement(By.id("user_value")).getAttribute("user_value"));

		// driver.findElement(By.xpath("//li[@data-title='My email address
		// is']")).click();
		// System.out.println("User nameEmail Id :"+
		// driver.findElement(By.xpath("//p[@id='user_value']")).getAttribute("value"));
	}

}
