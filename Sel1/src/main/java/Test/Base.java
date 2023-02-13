package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import listeners.EventListenerFile;
import pages.ContactUs_Page;
import pages.CreateAccount_Page;
import pages.Home_Page;
import pages.MyAccount;
import pages.SignIn_Page;
import testcases.LogTest;

import java.util.EventListener;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;

import excel.ExcelReader;

public class Base {
	public Properties prop;
	public FileInputStream fis;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public WebDriver driver;
	public ContactUs_Page contactUsObj;
	public CreateAccount_Page createAccountObj;
	public Home_Page homeObj;
	public Logger log;
	
	
	@BeforeClass
	public void Beforeclass()  {
		
		prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("C:\\Users\\Kapil Newaskar\\eclipse-workspace\\Sel1\\config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	}

	@AfterClass
	public void afterClass(){
		driver.close();
	}
	
}

@BeforeTest
public void testbefore() {
	extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
	extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
}

@AfterTest
public void testafter() {
	 
	extent.close();
}
