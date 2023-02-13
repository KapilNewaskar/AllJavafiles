package TTTTT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testt {

	WebDriver driver;

	@BeforeClass
	void beoreclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	void afterclass() {
		driver.close();
	}

	@Test
	void A() {
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Mens blazer");
		String getattri = driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).getAttribute("value");
		System.out.println(getattri);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();

		WebElement profilelogin = driver.findElement(By.xpath("//span[@class='desktop-userTitle']"));
		Actions act = new Actions(driver);
		act.moveToElement(profilelogin).build().perform();
		driver.findElement(By.xpath("//a[@class='desktop-linkButton']")).click();

		String authen = "Login or Signup";

		String dd = driver.findElement(By.xpath("//div[@class='welcome-header']")).getText();

		if (authen.equals(dd)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}

	}

}
