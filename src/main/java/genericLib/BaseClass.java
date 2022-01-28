package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.thread.ITestNGThreadPoolExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile pdata=new Propertyfile();
	public WebDriverutilies utilies=new WebDriverutilies();
	
	@BeforeMethod
	public void openApp() throws IOException 
	{  
		WebDriverManager.chromedriver().setup();   // its must to to tell WebDriverManager to setup chrome driver or geekodriver or safari etc
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getdata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException 
	{
		int status = res.getStatus();
		String name = res.getName();
		if(status==2) {
			Screenshot s=new Screenshot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}

}