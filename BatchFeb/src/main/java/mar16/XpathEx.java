package mar16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T shirt");
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Jeans");
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
		
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("Shirt");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
