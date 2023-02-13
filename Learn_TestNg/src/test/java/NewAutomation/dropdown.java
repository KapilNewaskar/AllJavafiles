package NewAutomation;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	WebDriver driver;

	@Parameters("browsername")
	@BeforeTest
	public void launchbrowser(@Optional("Chrome") String browsername) {
		switch (browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Browser not valid");
			break;
		}
		driver.manage().window().maximize();
	}

	@Parameters("sleeptime")
	@AfterTest
	public void closebrowser(long sleeptime) throws Exception {
		System.out.println(sleeptime);
		Thread.sleep(sleeptime);
		driver.quit();
	}

	@Parameters("url")
	@Test
	public void launchapp(String url) {

		driver.get(url);

	}

	@Test
	public void CalenderAnimation() {
		driver.findElement(By.linkText("ANIMATIONS")).click();

	}

	@Test
	public void selectdateandtime() {

		WebElement ddown = driver.findElement(By.id("animals"));
		Select select = new Select(ddown);
		select.selectByValue("avatar");

	}

	@Parameters("radioUrl")
	@Test
	public void radioBtn(String radioUrl) {

		driver.get(radioUrl);
		WebElement opt2 = driver.findElement(By.id("vfb-7-2"));
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		WebElement check2 = driver.findElement(By.id("vfb-6-2"));

		opt2.click();
		check1.click();
		check2.click();
	}

}
