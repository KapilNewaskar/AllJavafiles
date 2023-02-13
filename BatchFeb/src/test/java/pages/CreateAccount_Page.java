package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount_Page {
	public WebDriver driver;
	
	public CreateAccount_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
