package MouseOpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickActions {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		WebElement button1 = driver.findElement(By.id("rightClickBtn"));

		Actions act = new Actions(driver);
		act.contextClick(button1).build().perform();// Performed Right Click

		WebElement button2 = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(button2).build().perform();// Performed Double Click

		WebElement button3 = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
		button3.click();// Performed Click

	}

}
