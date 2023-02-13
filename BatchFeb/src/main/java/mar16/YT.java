package mar16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Oxygen-01 Running Shoes for Boys")).click();
		//driver.findElement(By.xpath("ong,a for apple,a for apple b for ball,phonics song,part501 by Hindi English Pathshala 3 months ago 6 minutes, 38 seconds 6,592,486 views']")).click();
	//driver.findElement(By.linkText("ABC Learn English Alphabet with Diana and Roma")).click();
	}
}

	