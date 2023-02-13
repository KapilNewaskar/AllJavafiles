package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(5000);
		
		WebElement Searchbtn = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		//input[@class='desktop-searchBar']
		
		Searchbtn.sendKeys("Laptop");
		
		String name = Searchbtn.getAttribute("Value");
		
		System.out.println(name);
		
		Actions act = new Actions(driver);
		act.moveToElement(Searchbtn).doubleClick().build().perform();
		
		Thread.sleep(5000);
		
		Searchbtn.sendKeys(Keys.DOWN);
		Searchbtn.sendKeys(Keys.DOWN);
		Searchbtn.sendKeys(Keys.DOWN);
		Searchbtn.sendKeys(Keys.ENTER);
		
		
		
	}

}
