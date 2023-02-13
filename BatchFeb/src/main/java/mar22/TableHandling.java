package mar22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tableInfo = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		for(int i=0; i<tableInfo.size(); i++) {
			String contactName = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]")).get(i).getText();
			System.out.println(contactName);
		}
		
	}

}
