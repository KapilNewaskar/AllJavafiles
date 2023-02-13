package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Contact us")).click();
		System.out.println("clicked on the contact us page");
		Thread.sleep(5000);
		
		driver.navigate().back();
		System.out.println("clicked on the back");
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		System.out.println("clicked on the forward");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("santosh@test.com");
		Thread.sleep(5000);
		System.out.println("email id added");
		
		driver.navigate().refresh();
		
		
	}

}
