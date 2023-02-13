package Files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_box_search {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");

		// Find the language list box element
		WebElement languageListBox = driver.findElement(By.id("searchLanguage"));

		// Find all options in the list box
		List<WebElement> options = languageListBox.findElements(By.tagName("option"));

		
		String optionToFind = "Français";
		for (WebElement option : options) {
			if (option.getText().equals(optionToFind)) {
				option.click();
				break;
			}
		}

	}

}
