package mar22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");

		List<WebElement> links = driver.findElements(By.xpath("//section[@id='block_various_links_footer']/ul/li/a"));

		for (int i = 0; i < links.size(); i++) {
			String linkName = driver.findElements(By.xpath("//section[@id='block_various_links_footer']/ul/li/a"))
					.get(i).getText();
			System.out.println(linkName);
			driver.findElements(By.xpath("//section[@id='block_various_links_footer']/ul/li/a")).get(i).click();
			driver.navigate().back();
		}

	}

}
