package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverutilies;
import pomPages.CoreJava_SearchResults_Page;
import pomPages.CoreJavaforSelenium_Page;
import pomPages.SkillraryLoginPage;
import pomPages.SkillraryLoginPage_Search;

public class Testcase3 extends BaseClass
{
	@Test
	public void tc3() throws InterruptedException, IOException
	{
		SkillraryLoginPage_Search Ssearch = new SkillraryLoginPage_Search(driver);
		Ssearch.SearchTextbox();
		Ssearch.SearchButton();
		
		utilies.switchTabs(driver);
		
		CoreJava_SearchResults_Page SRPage = new CoreJava_SearchResults_Page(driver);
		SRPage.CoreSeleniumLink_Click();		
		
		CoreJavaforSelenium_Page CJSelenium = new CoreJavaforSelenium_Page(driver);
		utilies.switchtoFrame(driver);
		CJSelenium.PlayFunction();
		Thread.sleep(4000);
		CJSelenium.PlayFunction();
		utilies.switchbackframe(driver);
		Thread.sleep(4000);
		CJSelenium.TwitterLinkclick();		
	}
	
}
