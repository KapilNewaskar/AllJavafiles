package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import excel.ExcelReader;

public class Gmail {
	
	public static ExcelReader excelReader;
	
	public static void main(String[] args) throws InterruptedException {
		
	excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Gmail.xlsx");
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\firefox\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	
	
	driver.findElement(By.id("identifierId")).sendKeys(excelReader.getCellData("Sheet1", "username", 7));
	
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	//driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b']")).click();
	
//	Thread.sleep(5000);
//	driver.quit();
	}
	
}
