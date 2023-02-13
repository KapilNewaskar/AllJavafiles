package Red;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\New\\Drivers\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://f5mail.rediff.com/");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("kausyme");
		driver.findElement(By.id("password")).sendKeys("Kausy@1234");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("Kausy");
		
		driver.findElement(By.xpath("//Input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Hello......");

	}

}
