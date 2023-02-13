package Guru99Demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	@Parameters("browsername")
	@BeforeTest
	public void InitiateBrowser(@Optional("Chrome") String browsername) {

		switch (browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Browser not exist");
		}
		driver.manage().window().maximize();
	}

	@Parameters("SleepTime")
	@AfterTest
	public void TearDownBrowser(long SleepTime) throws Exception {
		System.out.println(SleepTime);
		Thread.sleep(SleepTime);
		driver.quit();
	}

//	@Parameters("Guru99Url")
//	@Test
//	public void launchApp(String Guru99Url) {
//		driver.get(Guru99Url);
//		<parameter name="Guru99Url"
//				value="https://www.demo.guru99.com/V4/" />
//	}

	// @Parameters({ "Username", "Password" })
	@Test(dataProvider = "LoginData", dataProviderClass = ExcelDataProvider.class)
	public void LoginDetail(String Username, String Password) {
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("btnLogin")).click();

		SoftAssert softassert = new SoftAssert();

		String ExpectedTitle = "Guru99 Bank Manager Page";
		String ActualTitle = driver.getTitle();

		System.out.println(ActualTitle);

		softassert.assertEquals(ActualTitle, ExpectedTitle, "Page is mismatched");

//		<parameter name="Username" value="mngr463513" />
//		<parameter name="Password" value="urynanE" />

	}

}
