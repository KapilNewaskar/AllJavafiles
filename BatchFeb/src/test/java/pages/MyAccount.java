package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	public WebDriver driver;
	
	public MyAccount(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign out")
	private WebElement signOutlink;

	public WebElement getSignOutlink() {
		return signOutlink;
	}
	
	
	
}
