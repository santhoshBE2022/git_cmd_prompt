package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.Propertyfile;

public class SkillraryLoginPage_Search 
{
	public Propertyfile pdata=new Propertyfile();
	
	@FindBy(name = "q")
	private WebElement SearchBox;
		
	@FindBy(xpath="(//input[@value = 'go'])[1]")
	private WebElement SearchButton;
	
	public SkillraryLoginPage_Search(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SearchTextbox() throws IOException
	{
		SearchBox.sendKeys(pdata.getdata("SearchBoxValue"));
	}
	
	public void SearchButton()
	{
		SearchButton.click();
	}

}
