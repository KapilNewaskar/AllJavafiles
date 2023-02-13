package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	WebDriver driver;

	public SignIn_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign in")
	private WebElement Signin;

	@FindBy(id = "email")
	private WebElement Username;

	@FindBy(id = "passwd")
	private WebElement Password;

	@FindBy(id = "SubmitLogin")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username.sendKeys(Username);
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password.sendKeys(Password);
	}

}
