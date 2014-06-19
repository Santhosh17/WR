package com.wildriver.libraries;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class SuperTestNG 
{
	public static WebDriver driver;
	@ BeforeSuite
	public void preCondition()
	{ 
		String xlpath="./src/com/wildriver/testdata/LoginPage/Login Credentials.xls";
		String sheetName = "Login Credentials";
		String browser = Generic.getXlCellValue(xlpath, sheetName,0,1);
		if (browser.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "./EXE/chromedriver.exe");
			driver= new ChromeDriver();
			Reporter.log("opening Google Chrome",true);
		}
		else if (browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./EXE/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("opening Internet Explorer",true);
		}
		else 
		{
			driver = new FirefoxDriver();
			Reporter.log("opening Mozialla Firefox ",true);
		}
		Reporter.log("Failed to Open Browser",false);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	// End of Before Method
	@ AfterSuite
	public void postCondition()
	{
		driver.quit();
		Reporter.log("closing the browser",true);
	}
	// End of after Method 
}