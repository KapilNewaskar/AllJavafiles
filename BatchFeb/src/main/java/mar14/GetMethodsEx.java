package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\newas\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		String title1 = driver.getTitle();
		
		driver.findElement(By.linkText("Contact us")).click();
		String title2 = driver.getTitle();
		
		System.out.println(title1);
		System.out.println(title2);
		
		String homepageTitle = "My Store";
		String contactUsPageTitle = "Contact us - My Store";
		
		if(homepageTitle.equals(title1)) {
			System.out.println("Homepage title is matching");
		} else {
			System.out.println("Homepage title is NOTmatching");
		}
		
		if(contactUsPageTitle.equals(title2)) {
			System.out.println("Contact us title is matching");
		} else {
			System.out.println("Contact us title is NOTmatching");
		}
		      
		
		String currentURLofthePage = driver.getCurrentUrl();
		System.out.println(currentURLofthePage);
		
		driver.findElement(By.linkText("Sign in")).click();
		currentURLofthePage = driver.getCurrentUrl();
		System.out.println(currentURLofthePage);
		
		
		String currentPageSource = driver.getPageSource();
		System.out.println(currentPageSource);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
