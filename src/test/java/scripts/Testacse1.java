package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testacse1 extends BaseClass 
{
	@Test     // Test annotation is used here, not in Baseclass. Baseclass has only Before & After methods which define only reusable generic functionality
	public void tc1() 
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillraryDemoapp();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.switchTabs(driver);   // switching to new tab as it opens new tab
		utilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumTriainig();
		
		AddtocartPage ad=new AddtocartPage(driver);
		utilies.doubleClick(driver,ad.getPlusbtn()); // no switching needed as page doesn't open in new tab, instead opens in same tab
		ad.addtocart();
		utilies.alertPopup(driver);
	}
}