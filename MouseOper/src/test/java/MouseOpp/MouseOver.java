package MouseOpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/");
		// Thread.sleep(10000);
		// driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

		WebElement AllCourses = driver.findElement(By.linkText("All Courses"));

		Actions act = new Actions(driver);
		act.moveToElement(AllCourses).build().perform();
		Thread.sleep(1000);

		WebElement selenium = driver.findElement(By.xpath(
				"//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-27582']"));
		act.moveToElement(selenium).build().perform();

		WebElement seleniumWithJava = driver.findElement(
				By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-27583']"));
		seleniumWithJava.click();

		String ActualPage = driver
				.findElement(By.xpath("//h1[@class='elementor-heading-title elementor-size-default']")).getText();

		String ExpectedPage = "Selenium Training Online";

		if(ActualPage.equals(ExpectedPage)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
	}

}
