package FooterLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFooterLinks {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		List<WebElement> Links= driver.findElements(By.xpath("//body[1]/div[6]/footer[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/ul[1]")); 
		for(int i=0; i<Links.size();i++) {
			String linkname = driver.findElements(By.xpath("//body[1]/div[6]/footer[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/ul[1]")).get(i).getText();
			System.out.println(linkname);
			driver.findElements(By.xpath("//body[1]/div[6]/footer[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/ul[1]")).get(i).click();
			driver.navigate().back();
			
		}
		
	}
	
}
