package mar19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		
		//T shirt
		searchBox.sendKeys("T Shirt");	//search	
		searchButton.click();
		searchBox.clear();
		Thread.sleep(5000);
		
		//Shirt
		searchBox.sendKeys("Shirt");
		searchButton.click();
		searchBox.clear();
		Thread.sleep(5000);
		
		//Jeans
		searchBox.sendKeys("Jeans");
		searchButton.click();
		searchBox.clear();
		Thread.sleep(5000);
		
		
		

	}

}
