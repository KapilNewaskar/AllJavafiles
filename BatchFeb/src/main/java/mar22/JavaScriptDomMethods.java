package mar22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDomMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://bigbasket.com");
		
		driver.findElement(By.id("input")).sendKeys("colgate");
		
		String value = driver.findElement(By.id("input")).getAttribute("value");
		System.out.println(value);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String command = "return document.getElementById(\"input\").value";
		
		String getValue = (String) js.executeScript(command);
		
		
		System.out.println("Search value is " + getValue);
		
		
		
		
		
		
		
		
		
		
	}

}
