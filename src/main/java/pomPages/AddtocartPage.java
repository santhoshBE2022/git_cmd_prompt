package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	public void addtocart() {
		addtocartbtn.click();
	}
	
	

}