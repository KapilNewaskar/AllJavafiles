package mar23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");

		// Alert click on OK
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		// Alert click on Cancel
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		String getTextFromAlert = driver.switchTo().alert().getText();
		System.out.println(getTextFromAlert);
		driver.switchTo().alert().dismiss();

		// Alert give text and click on cancel
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Hello");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
