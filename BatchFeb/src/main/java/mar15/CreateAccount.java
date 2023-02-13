package mar15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");

		String gender = "female";

		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("email_create")).sendKeys("digitalcutlet12@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();

//		if(gender.equals("male")) {
//			driver.findElement(By.id("id_gender1")).click();
//		} else if(gender.equals("female")) {
//			driver.findElement(By.id("id_gender2")).click();
//		}

		if (gender.equals("male")) {
			driver.findElement(By.id("id_gender1")).click();
		} else {
			driver.findElement(By.id("id_gender2")).click();
		}

		driver.findElement(By.id("customer_firstname")).sendKeys("Santosh");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		driver.findElement(By.id("passwd")).sendKeys("123456");

		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByVisibleText("15");
		
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("5");
		
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByIndex(10);
		
//		Select days = new Select(driver.findElement(By.id("days")));
//		days.selectByVisibleText("15  ");

//		Select month = new Select(driver.findElement(By.id("months")));
//		month.selectByValue("5");

//		Select year = new Select(driver.findElement(By.id("years")));
//		year.selectByIndex(10);// 2013

		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();

		driver.findElement(By.id("optin")).click();

		boolean result = driver.findElement(By.id("optin")).isSelected();

		System.out.println(result);

		if (result == false) {
			driver.findElement(By.id("optin")).click();
		}

	}

}
