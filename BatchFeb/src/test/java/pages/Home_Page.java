package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;
	
	public Home_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_query_top")
	private WebElement searchBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	
	@FindBy(linkText = "Contact us")
	private WebElement ContactUsLink;
	
	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(linkText = "Women")
	private WebElement WomenLink;
	
	@FindBy(linkText = "Dresses")
	private WebElement DressesLink;

	@FindBy(linkText = "T-Shirts")
	private WebElement TShirtsLink;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(String name) {
		searchBox.sendKeys(name);
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getContactUsLink() {
		return ContactUsLink;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getWomenLink() {
		return WomenLink;
	}

	public WebElement getDressesLink() {
		return DressesLink;
	}

	public WebElement getTShirtsLink() {
		return TShirtsLink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
