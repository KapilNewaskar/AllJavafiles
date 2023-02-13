package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	public WebDriver driver;
	
	public SignIn_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "email_create")
	private WebElement emailCreate;
	
	@FindBy(id= "SubmitCreate")
	private WebElement SubmitButtonCreateAccount;
	
	@FindBy(id= "email")
	private WebElement emailLogin;
	
	@FindBy(id= "passwd")
	private WebElement passwdLogin;
	
	@FindBy(id= "SubmitLogin")
	private WebElement ButtonLogin;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPasswordLink;

	public WebElement getEmailCreate() {
		return emailCreate;
	}

	public void setEmailCreate(String emailCreate) {
		this.emailCreate.sendKeys(emailCreate);
	}

	public WebElement getEmailLogin() {
		return emailLogin;
	}

	public void setEmailLogin(String emailLogin) {
		this.emailLogin.sendKeys(emailLogin);
	}

	public WebElement getPasswdLogin() {
		return passwdLogin;
	}

	public void setPasswdLogin(String passwdLogin) {
		this.passwdLogin.sendKeys(passwdLogin);
	}

	public WebElement getSubmitButtonCreateAccount() {
		return SubmitButtonCreateAccount;
	}

	public WebElement getButtonLogin() {
		return ButtonLogin;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}		
}
