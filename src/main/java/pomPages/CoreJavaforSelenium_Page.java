package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaforSelenium_Page 
{
   @FindBy(xpath="//button[@class = 'play rounded-box state-paused']")
   private WebElement PlayButton;
   
   @FindBy(xpath="//span[@class = 'entypo-twitter']")
   private WebElement TwitterLink;
   
   public CoreJavaforSelenium_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void PlayFunction()
   {
	   PlayButton.click();
   }
   
   public void TwitterLinkclick()
   {
	   TwitterLink.click();
   }
   
}
