package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightcl= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement doublecl= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		WebElement click= driver.findElement(By.linkText("Selenium"));
		
		
		Actions act = new Actions(driver);	
		
		act.click(click).perform();
		act.contextClick(rightcl).perform();
		act.doubleClick(doublecl).perform();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
