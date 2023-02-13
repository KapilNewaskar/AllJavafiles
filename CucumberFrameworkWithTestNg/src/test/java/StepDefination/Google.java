package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		// Verify the title of the page is "Google"
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("The title of the page is correct: " + actualTitle);
		} else {
			System.out.println(
					"The title of the page is incorrect. Expected: " + expectedTitle + ", but got: " + actualTitle);
		}

		// Verify that the page is redirected to "google.co.in"
		String expectedUrl = "https://www.google.co.in/";
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("The URL of the page is correct: " + actualUrl);
		} else {
			System.out
					.println("The URL of the page is incorrect. Expected: " + expectedUrl + ", but got: " + actualUrl);
		}

		// Close the browser
		
	}

}
