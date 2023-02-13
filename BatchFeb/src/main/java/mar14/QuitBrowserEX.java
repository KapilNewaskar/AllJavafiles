package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowserEX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.quackit.com/javascript/popup_windows.cfm");
		
		driver.findElement(By.xpath("//input[@value='Open a Popup Window']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
