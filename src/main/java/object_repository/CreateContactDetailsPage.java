package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactDetailsPage {
	//declaration
	@FindBy(name = "firstname")
	private WebElement FirstNametxt;
	
	@FindBy(name = "lastname")
	private WebElement LastNametxt;
	
	@FindBy(name = "account_name")
	private WebElement AccountNametxt;
	
	@FindBy(name = "title")
	private WebElement Title;
	
	@FindBy(name = "department")
	private WebElement Department;
	
	@FindBy(name = "email")
	private WebElement Email;
	
	@FindBy(name = "assistant")
	private WebElement Assistant;
	
	@FindBy(name = "assistantphone")
	private WebElement Assistantphone;
	
	@FindBy(name = "mailingstreet")
	private WebElement Mailingstreet;
	
	@FindBy(name = "mailingpobox")
	private WebElement Mailingpobox;
	
	@FindBy(name = "mailingcity")
	private WebElement Mailingcity;
	
	@FindBy(name = "mailingstate")
	private WebElement Mailingstate;
	
	@FindBy(name = "mailingzip")
	private WebElement Mailingzip;
	
	@FindBy(name = "mailingcountry")
	private WebElement Mailingcountry;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement Officephone;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement Mobile;
	
	@FindBy(name = "homephone")
	private WebElement Homephone;
	
	@FindBy(name = "otherphone")
	private WebElement Otherphone;
	
	@FindBy(name = "fax")
	private WebElement Fax;
	
	@FindBy(xpath = "//INPUT[@name='contact_name']")
	private WebElement Reportsto;
	
	@FindBy(name = "secondaryemail")
	private WebElement Secondaryemail;
	
	@FindBy(name = "otherstreet")
	private WebElement Otherstreet;
	
	@FindBy(name = "otherpobox")
	private WebElement Otherpobox;
	
	@FindBy(name = "othercity")
	private WebElement Othercity;
	
	@FindBy(name = "otherstate")
	private WebElement Otherstate;
	
	@FindBy(name = "otherzip")
	private WebElement Otherzip;
	
	@FindBy(name = "othercountry")
	private WebElement Othercountry;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton; 
	
	
	//initialization
	public CreateContactDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//utilization
	public WebElement getFirstNametxt() {
		return FirstNametxt;
	}


	public WebElement getLastNametxt() {
		return LastNametxt;
	}


	public WebElement getAccountNametxt() {
		return AccountNametxt;
	}


	public WebElement getTitle() {
		return Title;
	}


	public WebElement getDepartment() {
		return Department;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getAssistant() {
		return Assistant;
	}


	public WebElement getAssistantphone() {
		return Assistantphone;
	}


	public WebElement getMailingstreet() {
		return Mailingstreet;
	}


	public WebElement getMailingpobox() {
		return Mailingpobox;
	}


	public WebElement getMailingcity() {
		return Mailingcity;
	}


	public WebElement getMailingstate() {
		return Mailingstate;
	}


	public WebElement getMailingzip() {
		return Mailingzip;
	}


	public WebElement getMailingcountry() {
		return Mailingcountry;
	}


	public WebElement getOFFICEPHONE() {
		return Officephone;
	}


	public WebElement getMOBILE() {
		return Mobile;
	}


	public WebElement getHomephone() {
		return Homephone;
	}


	public WebElement getOtherphone() {
		return Otherphone;
	}


	public WebElement getFax() {
		return Fax;
	}


	public WebElement getREPORTSTO() {
		return Reportsto;
	}


	public WebElement getSecondaryemail() {
		return Secondaryemail;
	}


	public WebElement getOtherstreet() {
		return Otherstreet;
	}


	public WebElement getOtherpobox() {
		return Otherpobox;
	}


	public WebElement getOthercity() {
		return Othercity;
	}


	public WebElement getOtherstate() {
		return Otherstate;
	}


	public WebElement getOtherzip() {
		return Otherzip;
	}


	public WebElement getOthercountry() {
		return Othercountry;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	
	//businesslogic
	public void ContactDetails(String FIRSTNAME, String LASTNAME, String ORGNAME, String TITLE, String DEPARTMENT,String EMAIL, String ASSISTANT, String ASSISTANTPHONE, String MAILINGSTREET, String MAILINGBOXPO, String MAILINGCITY, String MAILINGSTATE, String MAILINGPOSTALCODE, String MAILINGCOUNTRY, String OFFICEPHONE, String MOBILE, String HOMEPHONE, String OTHERPHONE, String FAX, String REPORTSTO, String SECONDARYMAIL, String OTHERSTREET, String OTHERPOBOX, String OTHERCITY, String OTHERSTATE,String OTHERPOSTALOTHERCOUNTRYCODE,String OTHERCOUNTRY ) {
		FirstNametxt.sendKeys(FIRSTNAME);
		LastNametxt.sendKeys(LASTNAME);
		AccountNametxt.sendKeys(ORGNAME);
		Title.sendKeys(TITLE);
		Department.sendKeys(DEPARTMENT);
		Email.sendKeys(EMAIL);
		Assistant.sendKeys(ASSISTANT);
		Assistantphone.sendKeys(ASSISTANTPHONE);
		Mailingstreet.sendKeys(MAILINGSTREET);
		Mailingpobox.sendKeys(MAILINGBOXPO);
		Mailingcity.sendKeys(MAILINGCITY);
		Mailingstate.sendKeys(MAILINGSTATE);
		Mailingzip.sendKeys(MAILINGPOSTALCODE);
		Mailingcountry.sendKeys(MAILINGCOUNTRY);
		Officephone.sendKeys(OFFICEPHONE);
		Mobile.sendKeys(MOBILE);
		Homephone.sendKeys(HOMEPHONE);
		Otherphone.sendKeys(OTHERPHONE);
		Fax.sendKeys(FAX);
		Reportsto.sendKeys(REPORTSTO);
		Secondaryemail.sendKeys(SECONDARYMAIL);
		Otherstreet.sendKeys(OTHERSTREET);
		Otherpobox.sendKeys(OTHERPOBOX);
		Othercity.sendKeys(OTHERCITY);
		Otherstate.sendKeys(OTHERSTATE);
		Otherzip.sendKeys(OTHERPOSTALOTHERCOUNTRYCODE);
		Othercountry.sendKeys(OTHERCOUNTRY);
		
	}
	
	public void Save() {
		SaveButton.click();
	}
	
	
	
	

}
