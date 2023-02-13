package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.xpath("(//li[@class='resp-tab-item'])[1]")).click();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("(//div[@class='ui-widget-content ui-draggable ui-draggable-handle'])[2]"));
        WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
        
		Actions act = new Actions(driver);	
		
		
		act.dragAndDrop(source, target).perform();
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
