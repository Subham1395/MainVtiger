package contacts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertiesUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.ContactPage;
import object_repository.CreateContactDetailsPage;
import object_repository.Home_Page;
import object_repository.Login_Page;

public class CreateContactsTest extends BaseClass {

	//public static void main(String[] args) throws Throwable {
	
	@Test
		public void createConatactsTest()throws Throwable{
		
		// craete object for all generic method
//		ExcelUtility elib = new ExcelUtility();
//		JavaUtility jlib = new JavaUtility();
//		PropertiesUtility plib = new PropertiesUtility();
//		WebDriverUtility wlib = new WebDriverUtility();
		//step1 read all the data
		/* read the data from properties file*/
//		String URL=plib.readDataFromPrpertiesFile("url");
//		String BROWSER=plib.readDataFromPrpertiesFile("browser");
//		String USERNAME=plib.readDataFromPrpertiesFile("username");
//		String PASSWORD=plib.readDataFromPrpertiesFile("password");
//		FileInputStream fis = new FileInputStream("src/test/resources/commondata.properties");
//		Properties poj= new Properties();
//		poj.load(fis);
//		String URL = poj.getProperty("url");
//		String BROWSER = poj.getProperty("browser");
//		String USERNAME = poj.getProperty("username");
//		String PASSWORD = poj.getProperty("password");
		
		/*Read the data from excel sheet */
		
//		Random ran = new Random();
//		int rannum = ran.nextInt(1000);
//		FileInputStream fis2 = new FileInputStream("src/test/resources/ExcelData2.xlsx");
//		Workbook book = WorkbookFactory.create(fis2);
//	String FIRSTNAME = book.getSheet("Contacts").getRow(0).getCell(0).getStringCellValue();
//	String LASTNAME = book.getSheet("Contacts").getRow(1).getCell(0).getStringCellValue()+rannum;
//	String ORGNAME = book.getSheet("Contacts").getRow(2).getCell(0).getStringCellValue();
//	String TITLE = book.getSheet("Contacts").getRow(3).getCell(0).getStringCellValue(); 
//	String DEPARTMENT = book.getSheet("Contacts").getRow(4).getCell(0).getStringCellValue();
//	String EMAIL = book.getSheet("Contacts").getRow(5).getCell(0).getStringCellValue();
//	String ASSISTANT = book.getSheet("Contacts").getRow(6).getCell(0).getStringCellValue();
//	String ASSISTANTPHONE = book.getSheet("Contacts").getRow(7).getCell(0).getStringCellValue();
//	String MAILINGSTREET = book.getSheet("Contacts").getRow(8).getCell(0).getStringCellValue();
//	String MAILINGBOXPO = book.getSheet("Contacts").getRow(9).getCell(0).getStringCellValue();
//	String MAILINGSTATE = book.getSheet("Contacts").getRow(10).getCell(0).getStringCellValue();
//	String MAILINGCITY = book.getSheet("Contacts").getRow(11).getCell(0).getStringCellValue();
//	String MAILINGPOSTALCODE = book.getSheet("Contacts").getRow(12).getCell(0).getStringCellValue();
//	String MAILINGCOUNTRY = book.getSheet("Contacts").getRow(13).getCell(0).getStringCellValue();
//	String OFFICEPHONE = book.getSheet("Contacts").getRow(14).getCell(0).getStringCellValue();
//	String MOBILE = book.getSheet("Contacts").getRow(15).getCell(0).getStringCellValue();
//	String HOMEPHONE = book.getSheet("Contacts").getRow(16).getCell(0).getStringCellValue();
//	String OTHERPHONE = book.getSheet("Contacts").getRow(17).getCell(0).getStringCellValue();
//	String FAX = book.getSheet("Contacts").getRow(18).getCell(0).getStringCellValue();
//	String REPORTSTO = book.getSheet("Contacts").getRow(19).getCell(0).getStringCellValue();
//	String SECONDARYMAIL = book.getSheet("Contacts").getRow(20).getCell(0).getStringCellValue();
//	String OTHERSTREET = book.getSheet("Contacts").getRow(21).getCell(0).getStringCellValue();
//	String OTHERPOBOX = book.getSheet("Contacts").getRow(22).getCell(0).getStringCellValue();
//	String OTHERCITY = book.getSheet("Contacts").getRow(23).getCell(0).getStringCellValue();
//	String OTHERSTATE = book.getSheet("Contacts").getRow(24).getCell(0).getStringCellValue();
//	String OTHERPOSTALOTHERCOUNTRYCODE = book.getSheet("Contacts").getRow(25).getCell(0).getStringCellValue();
//	String OTHERCOUNTRY = book.getSheet("Contacts").getRow(26).getCell(0).getStringCellValue();
	String FIRSTNAME = elib.readDataFromExcel("Contacts", 0, 0);
	String LASTNAME = elib.readDataFromExcel("Contacts", 1, 0) + jlib.getrandomnum();
	String ORGNAME = elib.readDataFromExcel("Contacts", 2, 0);
	String TITLE = elib.readDataFromExcel("Contacts", 3, 0);
	String DEPARTMENT = elib.readDataFromExcel("Contacts", 4, 0);
	String EMAIL = elib.readDataFromExcel("Contacts", 5, 0);
	String ASSISTANT = elib.readDataFromExcel("Contacts", 6, 0);
	String ASSISTANTPHONE = elib.readDataFromExcel("Contacts", 7, 0);
	String MAILINGSTREET = elib.readDataFromExcel("Contacts", 8, 0);
	String MAILINGBOXPO = elib.readDataFromExcel("Contacts", 9, 0);
	String MAILINGSTATE = elib.readDataFromExcel("Contacts", 10, 0);
	String MAILINGCITY = elib.readDataFromExcel("Contacts", 11, 0);
	String MAILINGPOSTALCODE = elib.readDataFromExcel("Contacts", 12, 0);
	String MAILINGCOUNTRY = elib.readDataFromExcel("Contacts", 13, 0);
	String OFFICEPHONE = elib.readDataFromExcel("Contacts", 14, 0);
	String MOBILE = elib.readDataFromExcel("Contacts", 15, 0);
	String HOMEPHONE = elib.readDataFromExcel("Contacts", 16, 0);
	String OTHERPHONE = elib.readDataFromExcel("Contacts", 17, 0);
	String FAX = elib.readDataFromExcel("Contacts", 18, 0);
	String REPORTSTO = elib.readDataFromExcel("Contacts", 19, 0);
	String SECONDARYMAIL = elib.readDataFromExcel("Contacts", 20, 0);
	String OTHERSTREET = elib.readDataFromExcel("Contacts", 21, 0);
	String OTHERPOBOX = elib.readDataFromExcel("Contacts", 22, 0);
	String OTHERCITY = elib.readDataFromExcel("Contacts", 23, 0);
	String OTHERSTATE = elib.readDataFromExcel("Contacts", 24, 0);
	String OTHERPOSTALOTHERCOUNTRYCODE = elib.readDataFromExcel("Contacts", 25, 0);
	String OTHERCOUNTRY = elib.readDataFromExcel("Contacts", 26, 0);
	//step2 LAUNCHING THE BROWSER
//	WebDriver driver = null;
//	if(BROWSER.equalsIgnoreCase("chrome"))
//	{
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//	}
//	else if(BROWSER.equalsIgnoreCase("firefox"))
//	{
//		WebDriverManager.firefoxdriver().setup();
//		driver= new FirefoxDriver();
//	}
//	else if(BROWSER.equalsIgnoreCase("edge"))
//	{
//		WebDriverManager.edgedriver().setup();
//		driver= new EdgeDriver();
//	}
//	else
//	{
//		System.out.println("launching failed");
//	}
//	System.out.println("launching browser succesfull");
//	
	//step3 apply the waits and maximize the window
	wlib.windowmaximize(driver);
	wlib.waiIimplicitly(driver);
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//step4 app load
//	driver.get(URL);
	
	//step5 login the app with credential
	Thread.sleep(2000);
//	Login_Page login= new Login_Page(driver);
//	login.login_Page(USERNAME, PASSWORD);
	Thread.sleep(2000);
	// below all the login script converting into above lines using object repository.
//	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//	driver.findElement(By.id("submitButton")).click();
	
	//step6 navigate to contacts module
	Home_Page home = new Home_Page(driver);
	home.clickContactModule();
	//driver.findElement(By.linkText("Contacts")).click();
	
	//step7 click on create contact look up image
	ContactPage cp= new ContactPage(driver);
	cp.clickContact();
	//driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	
	//step8 create contact and fill all details 
	CreateContactDetailsPage ccd= new CreateContactDetailsPage(driver);
	ccd.ContactDetails(FIRSTNAME, LASTNAME, ORGNAME, TITLE, DEPARTMENT, EMAIL, ASSISTANT, ASSISTANTPHONE, MAILINGSTREET, MAILINGBOXPO, MAILINGCITY, MAILINGSTATE, MAILINGPOSTALCODE, MAILINGCOUNTRY, OFFICEPHONE, MOBILE, HOMEPHONE, OTHERPHONE, FAX, REPORTSTO, SECONDARYMAIL, OTHERSTREET, OTHERPOBOX, OTHERCITY, OTHERSTATE, OTHERPOSTALOTHERCOUNTRYCODE, OTHERCOUNTRY);
//	driver.findElement(By.name("firstname")).sendKeys(FIRSTNAME);
//	driver.findElement(By.name("lastname")).sendKeys(LASTNAME);
//	driver.findElement(By.name("account_name")).sendKeys(ORGNAME);
//	driver.findElement(By.name("title")).sendKeys(TITLE);
//	driver.findElement(By.name("department")).sendKeys(DEPARTMENT);
//	driver.findElement(By.name("email")).sendKeys(EMAIL);
//	driver.findElement(By.name("assistant")).sendKeys(ASSISTANT);
//	driver.findElement(By.name("assistantphone")).sendKeys(ASSISTANTPHONE);
//	Thread.sleep(1000);
//	driver.findElement(By.name("mailingstreet")).sendKeys(MAILINGSTREET);
//	driver.findElement(By.name("mailingpobox")).sendKeys(MAILINGBOXPO);
//	driver.findElement(By.name("mailingcity")).sendKeys(MAILINGCITY);
//	driver.findElement(By.name("mailingstate")).sendKeys(MAILINGSTATE);
//	driver.findElement(By.name("mailingzip")).sendKeys(MAILINGPOSTALCODE);
//	driver.findElement(By.name("mailingcountry")).sendKeys(MAILINGCOUNTRY);
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(OFFICEPHONE);
//	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(MOBILE);
//	driver.findElement(By.name("homephone")).sendKeys(HOMEPHONE);
//	driver.findElement(By.name("otherphone")).sendKeys(OTHERPHONE);
//	driver.findElement(By.name("fax")).sendKeys(FAX);
//	driver.findElement(By.xpath("//INPUT[@name='contact_name']")).sendKeys(REPORTSTO);
//	driver.findElement(By.name("secondaryemail")).sendKeys(SECONDARYMAIL);
//	Thread.sleep(1000);
//	driver.findElement(By.name("otherstreet")).sendKeys(OTHERSTREET);
//	driver.findElement(By.name("otherpobox")).sendKeys(OTHERPOBOX);
//	driver.findElement(By.name("othercity")).sendKeys(OTHERCITY);
//	driver.findElement(By.name("otherstate")).sendKeys(OTHERSTATE);
//	driver.findElement(By.name("otherzip")).sendKeys(OTHERPOSTALOTHERCOUNTRYCODE);
//	driver.findElement(By.name("othercountry")).sendKeys(OTHERCOUNTRY);
	
	//step9 save
	ccd.Save();
	//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(1000);
	//step10 validate
	String VALIDATE = driver.findElement(By.xpath("//td[@id='mouseArea_Last Name']")).getText();
	
	if(VALIDATE.contains(LASTNAME))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	//step11  sing out
//	Thread.sleep(1000);
//	home.logOut(driver);
//	WebElement SIGNOUT = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//	Actions act = new Actions(driver);
//	act.moveToElement(SIGNOUT).perform();
	
	//step12 close the window
//	driver.quit();
   }
}
	
	
	
	
	
	
	
	