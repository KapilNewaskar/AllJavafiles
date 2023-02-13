package mar13_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("santosh@test.com");
	
	}

}
