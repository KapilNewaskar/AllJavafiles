package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactUs_Page {
	public WebDriver driver;
	
	public ContactUs_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
