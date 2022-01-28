package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	public SkillraryLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gerasButton() {
		gerasbtn.click();
	}
	
	public void skillraryDemoapp() {
		demoApp.click();
	}	

}