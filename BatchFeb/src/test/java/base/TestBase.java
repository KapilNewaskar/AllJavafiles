package base;

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

public class TestBase {
	public Properties prop;
	public FileInputStream fis;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public WebDriver driver;
	public ContactUs_Page contactUsObj;
	public CreateAccount_Page createAccountObj;
	public Home_Page homeObj;
	public Logger log;
	
	
	public MyAccount myAccountObj;
	public SignIn_Page signInObj;
	public static ExcelReader excelReader;
//	public static ExtentReports extent;
//	public static ExtentTest logger;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\config.Properties");
	//	log = LogManager.getLogger(LogTest.class.getName());
		
		excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\inputData.xlsx");
		//load the file using below command
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("provided browser is invalid");
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		
		//class file which we created in above step
		EventListenerFile ecapture = new EventListenerFile();
		
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);
		
		contactUsObj = new ContactUs_Page(eventHandler);
		createAccountObj = new CreateAccount_Page(eventHandler);
		homeObj = new Home_Page(eventHandler);
		myAccountObj = new MyAccount(eventHandler);
		signInObj = new SignIn_Page(eventHandler);

	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
	
	@AfterMethod
	public void afterMethod() {
		try {
			if(myAccountObj.getSignOutlink().isEnabled()) {
				myAccountObj.getSignOutlink().click();
			}
		} catch(Exception e) {
			
		}
		extent.endTest(logger);
		extent.flush();
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
