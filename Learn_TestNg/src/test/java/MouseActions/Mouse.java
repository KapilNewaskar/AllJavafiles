package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//button[@class='nav-icon nav-arrow']")).click();
		
		
//		WebElement shopByCat = driver.findElement(By.partialLinkText("Shop by Category"));
//		WebElement Beverages = driver.findElement(By.linkText("Beverages"));
//		WebElement Tea = driver.findElement(By.linkText("Tea"));
//		WebElement TeaBags = driver.findElement(By.linkText("Tea Bags"));
//
//		Actions act = new Actions(driver);
//		act.moveToElement(shopByCat).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(Beverages).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(Tea).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(TeaBags).click();
//		Thread.sleep(3000);
//
//		String ExpectedText = "Tea Bags";
//		String ActualText = driver.findElement(By.className("ng-binding")).getText();
//
//		if (ExpectedText.equals(ActualText)) {
//			System.out.println("Test pass");
//		} else {
//			System.out.println("Test Fail");
//		}
//
	}

}
