package mar19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		String authName = "AUTH";
		
		driver.findElement(By.linkText("Sign in")).click();
		
		String authentication_text_from_Webpage = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		
		
		if(authName.equals(authentication_text_from_Webpage)) {
			System.out.println("Page is navigted successfully to Authentication page");
		} else {
			System.out.println("Page is NOT navigted to Authentication page");
			System.exit(0);			
		}
		
		driver.findElement(By.id("email_create")).sendKeys("dc12@gmail.com");
		
		
		
	}

}
