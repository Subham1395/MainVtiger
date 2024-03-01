package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.Home_Page;
import object_repository.Login_Page;

public class BaseClass {
	
	// craete all required object
	public ExcelUtility elib = new ExcelUtility();
	public JavaUtility jlib = new JavaUtility();
	public PropertiesUtility plib = new PropertiesUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public WebDriver driver = null;
	
	@BeforeSuite
	public void bsConfiguration() 
	{
		System.out.println("=======DB coneection succesfully======");
	}
	//below @parameters("browser") and @beforeTest both are only use for cross browser testing after this revert back this 
	//@Parameters("browser")
	//@BeforeTest
	@BeforeClass
	public void bcConfiguration() throws Throwable 
	{
		String URL=plib.readDataFromPrpertiesFile("url");
		String BROWSER=plib.readDataFromPrpertiesFile("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("launching failed");
		}
		System.out.println("launching browser succesfull");
		System.out.println("=====Launching browser successfully=====");
		driver.get(URL);
	}
	@BeforeMethod
	public void bmConfiguration() throws Throwable 
	{
		String USERNAME=plib.readDataFromPrpertiesFile("username");
		String PASSWORD=plib.readDataFromPrpertiesFile("password");
		Login_Page login= new Login_Page(driver);
		login.login_Page(USERNAME, PASSWORD);
		System.out.println("=====login application successfully======");
	}
	
	@AfterMethod
	public void amConfiguration() 
	{
		Home_Page home = new Home_Page(driver);
		home.logOut(driver);
		
		System.out.println("=====log out application successfully====");
	}
	//@AfterTest //this was added only for cross browser testing
	@AfterClass
	public void acConfiguration() 
	{
		driver.quit();
		System.out.println("======close browser successfully======");
	}
	@AfterSuite
	public void asConfiguration() 
	{
		System.out.println("====close DB connection successfully===== ");
	}
	

}
