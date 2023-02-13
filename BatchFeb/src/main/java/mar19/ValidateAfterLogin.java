package mar19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateAfterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		if(driver.findElement(By.id("email_create")).isEnabled()) {
			System.out.println("Page is navigted successfully to Authentication page");
		} else {
			System.out.println("Page is NOT navigted to Authentication page");
			System.exit(0);			
		}
		
		driver.findElement(By.id("email")).sendKeys("santosh@test.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		
		if(driver.findElement(By.linkText("Sign out")).isEnabled()) {
			System.out.println("successfully logged in");
		} else {
			System.out.println("Fail to login");
		}
		
		
		
		
	}

}
