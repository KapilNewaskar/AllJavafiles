package interviewProgramsSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AddToCardBigBasketMultiple {
	
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Santosh\\\\Automation\\\\Workspace_new\\\\SeleniumJune\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/ps/?q=vegetables");
		
		String[] vegetables = {"Cucumber - English", "Carrot - Orange"};
		
		List<WebElement> vegetablesList = driver.findElements(By.xpath("//div[@qa='product_name']//a[@class='ng-binding']"));
		
		System.out.println(vegetablesList.size());
		
		for(int i=0;i<vegetablesList.size();i++) {
			
			List vegList = Arrays.asList(vegetables);
			
			System.out.println(vegetablesList.get(i).getText());
			if(vegList.contains(vegetablesList.get(i).getText())) {
				String elements = "//a[text()='"+vegetablesList.get(i).getText()+"']/parent::div[@class='col-sm-12 col-xs-7 prod-name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']";
				System.out.println(elements);
				Thread.sleep(5000);
				driver.findElement(By.xpath(elements)).click();
				
				//driver.findElement(By.xpath("//div[@id='city-drop-overlay']")).click();
				//driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).click();
				
/*				if(driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).isDisplayed() && driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).isEnabled()) {
					driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).click();
				}
*/				
				/*driver.findElement(By.xpath(elements)).click();
				if(driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[1]/div/div[2]/a")).isEnabled() && driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[1]/div/div[2]/a")).isDisplayed()) {
					driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[1]/div/div[2]/a")).click();
				}*/
			} else {
				//System.out.println(" not found : " + vegetablesList.get(i).getText());
				System.out.println("not found " + vegList.get(i));
			}
		}
	}
}



//Actions actions = new Actions(driver);
//actions.moveToElement((WebElement) By.xpath("//a[text()='Tomato - Hybrid']/parent::div[@class='col-sm-12 col-xs-7 prod-name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']")).click().build().perform();
