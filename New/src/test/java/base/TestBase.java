package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import excel.ExcelReader;
import learn.LogTest;
import listeners.EventListenerFile;
import pages.Home_Page;
import pages.SignIn_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;

public class TestBase {

	public WebDriver driver;
	public Home_Page homeObj;
	public SignIn_Page SignInObj;
	public Properties prop;
	public FileInputStream fis;
	public static ExcelReader excelreader;
	public static ExtentReports extent;
	public static ExtentTest logger;
//	public Logger log;

	@BeforeClass
	public void beforeclass() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
		prop.load(fis);
		excelreader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\inputData.xlsx");
//		EventListenerFile ecapture = new EventListenerFile();
//		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
//		eventHandler.register(ecapture);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\New\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\New\\Drivers\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Kapil Newaskar\\eclipse-workspace\\New\\Drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Browser is Invalid");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");

		homeObj = new Home_Page(driver);
		SignInObj = new SignIn_Page(driver);
	}

	@AfterClass
	public void afterclass() {
		driver.close();

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
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		extent.endTest(logger);
		extent.flush();
	}
}
