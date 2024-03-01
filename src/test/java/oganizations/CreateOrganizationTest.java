package oganizations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

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
import object_repository.CreateOrganizationDetailsPage;
import object_repository.Home_Page;
import object_repository.Login_Page;
import object_repository.OrganizationPage;

public class CreateOrganizationTest extends BaseClass {

	//public static void main(String[] args) throws Throwable {
	@Test
		public void createOrganizationTest()throws Throwable{
		//step1 read all the data
				/* read the data from properties file*/
//		ExcelUtility elib = new ExcelUtility();
//		JavaUtility jlib = new JavaUtility();
//		PropertiesUtility plib = new PropertiesUtility();
//		WebDriverUtility wlib = new WebDriverUtility();
		
		//read the data from properties file.
//		String URL = plib.readDataFromPrpertiesFile("url");
//		String BROWSER = plib.readDataFromPrpertiesFile("browser");
//		String USERNAME = plib.readDataFromPrpertiesFile("username");
//		String PASSWORD = plib.readDataFromPrpertiesFile("password");
//				FileInputStream fis = new FileInputStream("src/test/resources/commondata.properties");
//				Properties poj= new Properties();
//				poj.load(fis);
//				String URL = poj.getProperty("url");
//				String BROWSER = poj.getProperty("browser");
//				String USERNAME = poj.getProperty("username");
//				String PASSWORD = poj.getProperty("password");
				
				/*Read the data from excel sheet */
//				Random ran = new Random();
//				int rannum = ran.nextInt(1000);
//				FileInputStream fis2 = new FileInputStream("src/test/resources/ExcelData2.xlsx");
//				Workbook book = WorkbookFactory.create(fis2);
//				 String ORGNAME = book.getSheet("Organizations").getRow(0).getCell(1).getStringCellValue()+rannum;
//				 String WEBSITE = book.getSheet("Organizations").getRow(1).getCell(1).getStringCellValue();
//				String OTHEREMAIL = book.getSheet("Organizations").getRow(4).getCell(1).getStringCellValue();
//				String BILLINGADDRESS = book.getSheet("Organizations").getRow(5).getCell(1).getStringCellValue();
//				 String BILLINGPOBOX = book.getSheet("Organizations").getRow(6).getCell(1).getStringCellValue();
//				 String BILLINGCITY = book.getSheet("Organizations").getRow(7).getCell(1).getStringCellValue();
//				String BILLINGSTATE = book.getSheet("Organizations").getRow(8).getCell(1).getStringCellValue();
//				 String BILLINGPORTALCODE = book.getSheet("Organizations").getRow(9).getCell(1).getStringCellValue();
//				String BILLINGCOUNTRY = book.getSheet("Organizations").getRow(10).getCell(1).getStringCellValue();
//				String PHONE = book.getSheet("Organizations").getRow(11).getCell(1).getStringCellValue();
//				String FAX = book.getSheet("Organizations").getRow(12).getCell(1).getStringCellValue();
//				String OTHERPHONE = book.getSheet("Organizations").getRow(13).getCell(1).getStringCellValue();
//				String EMAIL = book.getSheet("Organizations").getRow(14).getCell(1).getStringCellValue();
//				String OWNERSHIP = book.getSheet("Organizations").getRow(15).getCell(1).getStringCellValue();
//				String SICCODE = book.getSheet("Organizations").getRow(16).getCell(1).getStringCellValue();
//				String SHIPPINGADDRESS = book.getSheet("Organizations").getRow(17).getCell(1).getStringCellValue();
//				String SHIPPINGPOBOX = book.getSheet("Organizations").getRow(18).getCell(1).getStringCellValue();
//				String SHIPPINGCITY = book.getSheet("Organizations").getRow(19).getCell(1).getStringCellValue();
//				String SHIPPINGSTATE = book.getSheet("Organizations").getRow(20).getCell(1).getStringCellValue();
//				String SHIPPINGPOSTALCODE = book.getSheet("Organizations").getRow(21).getCell(1).getStringCellValue();
//				String SHIPPINGCOUNTRY = book.getSheet("Organizations").getRow(22).getCell(1).getStringCellValue();
				
				String ORGNAME = elib.readDataFromExcel("Organizations", 0, 1)+jlib.getrandomnum();
				String WEBSITE = elib.readDataFromExcel("Organizations", 1, 1);
				String OTHEREMAIL = elib.readDataFromExcel("Organizations", 4, 1);
				String BILLINGADDRESS = elib.readDataFromExcel("Organizations", 5, 1);
		        String BILLINGPOBOX = elib.readDataFromExcel("Organizations", 6, 1);
				String BILLINGCITY = elib.readDataFromExcel("Organizations", 7, 1);
				String BILLINGSTATE = elib.readDataFromExcel("Organizations", 8, 1);
				String BILLINGPORTALCODE = elib.readDataFromExcel("Organizations", 9, 1);
				String BILLINGCOUNTRY = elib.readDataFromExcel("Organizations", 10, 1);
				String PHONE = elib.readDataFromExcel("Organizations", 11, 1);
				String FAX = elib.readDataFromExcel("Organizations", 12, 1);
				String OTHERPHONE = elib.readDataFromExcel("Organizations", 13, 1);
				String EMAIL = elib.readDataFromExcel("Organizations", 14, 1);
				String OWNERSHIP = elib.readDataFromExcel("Organizations", 15, 1);
				String SICCODE = elib.readDataFromExcel("Organizations", 16, 1);
				String SHIPPINGADDRESS = elib.readDataFromExcel("Organizations", 17, 1);
				String SHIPPINGPOBOX = elib.readDataFromExcel("Organizations", 18, 1);
				String SHIPPINGCITY = elib.readDataFromExcel("Organizations", 19, 1);
				String SHIPPINGSTATE = elib.readDataFromExcel("Organizations", 20, 1);
				String SHIPPINGPOSTALCODE = elib.readDataFromExcel("Organizations", 21, 1);
				String SHIPPINGCOUNTRY = elib.readDataFromExcel("Organizations", 22, 1);
				
				//STEP2 LAUNCH THE BROWSER
//				WebDriver driver = null;
//				if(BROWSER.equalsIgnoreCase("chrome"))
//				{
//					WebDriverManager.chromedriver().setup();
//					driver= new ChromeDriver();
//				}
//				else if(BROWSER.equalsIgnoreCase("firefox"))
//				{
//					WebDriverManager.firefoxdriver().setup();
//					driver= new FirefoxDriver();
//				}
//				else if(BROWSER.equalsIgnoreCase("edge"))
//				{
//					WebDriverManager.edgedriver().setup();
//					driver= new EdgeDriver();
//				}
//				else
//				{
//					System.out.println("launching failed");
//				}
//				System.out.println("launching browser succesfull");
				
				//step3 apply the waits and maximize the window
				wlib.windowmaximize(driver);
				wlib.waiIimplicitly(driver);
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//step4 app load
//				driver.get(URL);
				
				//step5 login the app with credential
				Thread.sleep(2000);
//				Login_Page login = new Login_Page(driver);
//				login.login_Page(USERNAME, PASSWORD);
//				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//				driver.findElement(By.id("submitButton")).click();
				
				//step6 navigate to organization module
				Home_Page home = new Home_Page(driver);
				home.clickOrganizationModule();
				//driver.findElement(By.linkText("Organizations")).click();
				
				//step7 click on organization create image
				Thread.sleep(2000);
				OrganizationPage op= new OrganizationPage(driver);
				op.clickOrganizationModule();
				//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
				
				//step8 create organization and fill required details
				CreateOrganizationDetailsPage cod= new CreateOrganizationDetailsPage(driver);
				cod.OrganizationDetails(ORGNAME, WEBSITE, OTHEREMAIL, BILLINGADDRESS, BILLINGPOBOX, BILLINGCITY, BILLINGSTATE, BILLINGPORTALCODE, BILLINGCOUNTRY, PHONE, FAX, OTHERPHONE, EMAIL, OWNERSHIP, SICCODE, SHIPPINGADDRESS, SHIPPINGPOBOX, SHIPPINGCITY, SHIPPINGSTATE, SHIPPINGPOSTALCODE, SHIPPINGCOUNTRY);

//                driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(ORGNAME);
//                driver.findElement(By.name("website")).sendKeys(WEBSITE);
//                driver.findElement(By.xpath("//input[@id='email2']")).sendKeys(OTHEREMAIL);
//                Thread.sleep(1000);
//                driver.findElement(By.name("bill_street")).sendKeys(BILLINGADDRESS);
//                driver.findElement(By.name("bill_pobox")).sendKeys(BILLINGPOBOX);
//                driver.findElement(By.name("bill_city")).sendKeys(BILLINGCITY);
//                driver.findElement(By.name("bill_state")).sendKeys(BILLINGSTATE);
//                driver.findElement(By.name("bill_code")).sendKeys(BILLINGPORTALCODE);
//                driver.findElement(By.name("bill_country")).sendKeys(BILLINGCOUNTRY);
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(PHONE);
//                driver.findElement(By.xpath("//input[@id='fax']")).sendKeys(FAX);
//                driver.findElement(By.xpath("//input[@id='otherphone']")).sendKeys(OTHERPHONE);
//                driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(EMAIL);
//                driver.findElement(By.xpath("//input[@id='ownership']")).sendKeys(OWNERSHIP);
//                driver.findElement(By.xpath("//input[@id='siccode']")).sendKeys(SICCODE);
//                Thread.sleep(2000);
//                driver.findElement(By.name("ship_street")).sendKeys(SHIPPINGADDRESS);
//                driver.findElement(By.name("ship_pobox")).sendKeys(SHIPPINGPOBOX);
//                driver.findElement(By.name("ship_city")).sendKeys(SHIPPINGCITY);
//                driver.findElement(By.name("ship_state")).sendKeys(SHIPPINGSTATE);
//                driver.findElement(By.name("ship_code")).sendKeys(SHIPPINGPOSTALCODE);
//                driver.findElement(By.name("ship_country")).sendKeys(SHIPPINGCOUNTRY);
//                Thread.sleep(1000);
//                
                
                //step9 save
				Thread.sleep(1000);
				cod.SaveButton();
               // driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
                
              
                //step10 validate
                
                String VALIDATE = driver.findElement(By.xpath("//td[@id='mouseArea_Organization Name']")).getText();
                if(VALIDATE.contains(ORGNAME))
            	{
            		System.out.println("PASS");
            	}
            	else
            	{
            		System.out.println("FAIL");
            	}
            	
//            	//step11  sing out
//            	Thread.sleep(1000);
//            	home.logOut(driver);
//            	WebElement SIGNOUT = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//            	Actions act = new Actions(driver);
//            	act.moveToElement(SIGNOUT).perform();
            	
            	//step12 close the window
//            	driver.quit();
//				
	}

}
