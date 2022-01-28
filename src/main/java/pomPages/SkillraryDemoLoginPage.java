package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(name="addresstype")  // used only in testcase2
	private WebElement coursedd;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement selenium;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCoursedd() {    // used only in testcase2
		return coursedd;
	}

	public WebElement getCoursetab() {
		return coursetab;
	}

	public void seleniumTriainig() {
		selenium.click();
	}
	
	
	
	
	
	
	

}