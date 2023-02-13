package Guru99Demo;

import static org.testng.Assert.assertEquals;

import org.apache.commons.collections4.functors.WhileClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		String monthYearVal = driver.findElement(By.className("monthTitle")).getText();
		System.out.println(monthYearVal);

		String month = monthYearVal.split(" ")[0].trim();
		String year = monthYearVal.split(" ")[1].trim();

		while (!(month.equals("Dec") && year.equals("2023"))) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			monthYearVal = driver.findElement(By.className("monthTitle")).getText();
			System.out.println(monthYearVal);

			month = monthYearVal.split(" ")[0].trim();
			year = monthYearVal.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//td[text()='26']")).click();

	}

}
