package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "search_query_top")
	private WebElement SearchBox;

	@FindBy(name = "submit_search")
	private WebElement SearchButton;

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public void setSearchBox(String name) {
		SearchBox.sendKeys(name);
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

}
