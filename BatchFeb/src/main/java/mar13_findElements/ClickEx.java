package mar13_findElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\newas\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("input")).sendKeys("tomato");
		
		driver.findElement(By.xpath("btn btn-default bb-search")).click();
	}

}
