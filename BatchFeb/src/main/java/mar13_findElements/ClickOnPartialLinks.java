package mar13_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnPartialLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.bigbasket.com/?nc=logo");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("bb Wallet")).click();
		
	}

}
