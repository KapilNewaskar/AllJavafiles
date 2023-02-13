package MouseOpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement source = driver.findElement(By.id("box6"));//Rome
		WebElement target = driver.findElement(By.id("box106"));//Italy

		WebElement source1 = driver.findElement(By.id("box3"));//Washington
		WebElement target1 = driver.findElement(By.id("box103"));//United States
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		act.dragAndDrop(source1, target1).build().perform();
	}

}
