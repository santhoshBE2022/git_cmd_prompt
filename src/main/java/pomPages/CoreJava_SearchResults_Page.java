package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJava_SearchResults_Page 
{
	@FindBy(linkText="Core Java For Selenium Trainin")
	private WebElement CoreSeleniumLink;
	
	public CoreJava_SearchResults_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CoreSeleniumLink_Click()
	{
		CoreSeleniumLink.click();
	}
	
}
