package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
    private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
	public WebElement getFacebook() {
		return facebook;				// returns webelement so that its location can be found to click
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getCart() {
		return cart;
	}	
	
	public void facebookIcon() {
		facebook.click();
	}
	
	
}