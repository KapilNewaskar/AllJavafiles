package mar21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://bigbasket.com");
				
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		
		//Actions act = new Actions(driver);
		//act.moveToElement(shopByCat).build().perform();
		
		Actions act = new Actions(driver);
		act.moveToElement(shopByCat).build().perform();		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Foodgrains, Oil & Masala")).click();
		
		//span[@ng-bind='vm.screen_name']
		
		String onlineText = driver.findElement(By.xpath("(//span[contains(text(), 'Foodgrains, Oil & Masala')])[4]")).getText();
		String text = "Foodgrains, Oil & Masala";
		
		if(text.equals(onlineText)) {
			System.out.println("page is navigated to oil and masala: PASS");
		} else {
			System.out.println("page is NOT navigated to oil and masala: FAIL");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
