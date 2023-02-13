package mar21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Arrowdown_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("colgate");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
	}

}
