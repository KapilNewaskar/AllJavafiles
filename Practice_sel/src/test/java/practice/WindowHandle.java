package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window: "+parentWindowHandle);
		
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//button[@id='alertBox']")).click();
				driver.switchTo().alert().accept();
				
			//	driver.manage().window().maximize();
			//	driver.findElement(By.id("firstName")).sendKeys("Kapil");
				Thread.sleep(5000);
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("kapilll");
		Thread.sleep(5000);
		driver.quit();
	}

}
