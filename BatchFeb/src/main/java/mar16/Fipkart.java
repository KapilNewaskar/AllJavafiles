package mar16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.name("search_query")).sendKeys("t-shirt");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByValue("3");
		Thread.sleep(5000);
		
		driver.findElement(By.id("color_16")).click();
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
		
		
		
		
	}

}
