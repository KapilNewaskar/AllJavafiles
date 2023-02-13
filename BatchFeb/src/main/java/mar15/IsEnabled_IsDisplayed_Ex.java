package mar15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_IsDisplayed_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://html.com/attributes/button-disabled/");
		
		boolean searchRes = driver.findElement(By.className("search-field")).isEnabled();
		System.out.println(searchRes); // true
		
		boolean buttonRes = driver.findElement(By.xpath("//div[@class='render']/button")).isEnabled();
		System.out.println(buttonRes); // false 
		
		boolean buttonRes2 = driver.findElement(By.xpath("//div[@class='render']/button")).isDisplayed();
		System.out.println(buttonRes2); // true
		
		
		

		
		
	}

}
