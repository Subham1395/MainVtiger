package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationDetailsPage {
	//declare
	@FindBy (xpath="//input[@name='accountname']")
	private WebElement OrgName;
	
	@FindBy(name="website")
	private WebElement Website;
	
	@FindBy(xpath="//input[@id='email2']")
	private WebElement Otheremail;
	
	@FindBy(name="bill_street")
	private WebElement Billingaddress;
	
	@FindBy(name="bill_pobox")
	private WebElement Billpobox;
	
	@FindBy(name="bill_city")
	private WebElement Billcity;
	
	@FindBy(name="bill_state")
	private WebElement Billstate;
	
	@FindBy(name="bill_code")
	private WebElement Billcode;
	
	@FindBy(name="bill_country")
	private WebElement Billcountry;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@id='fax']")
	private WebElement Fax;
	
	@FindBy(xpath="//input[@id='otherphone']")
	private WebElement Otherphone;
	
	@FindBy(xpath="//input[@id='email1']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='ownership']")
	private WebElement Ownership;
	
	@FindBy(xpath="//input[@id='siccode']")
	private WebElement Siccode;
	
	@FindBy(name="ship_street")
	private WebElement Shipstreet;
	
	@FindBy(name="ship_pobox")
	private WebElement Shippobox;
	
	@FindBy(name="ship_city")
	private WebElement Shipcity;
	
	@FindBy(name="ship_state")
	private WebElement Shipstate;
	
	@FindBy(name="ship_code")
	private WebElement Shipcode;
	
	@FindBy(name="ship_country")
	private WebElement Shipcountry;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	//initialization
	public CreateOrganizationDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getOtheremail() {
		return Otheremail;
	}

	public WebElement getBillingaddress() {
		return Billingaddress;
	}

	public WebElement getBillpobox() {
		return Billpobox;
	}

	public WebElement getBill_city() {
		return Billcity;
	}

	public WebElement getBillstate() {
		return Billstate;
	}

	public WebElement getBillcode() {
		return Billcode;
	}

	public WebElement getBillcountry() {
		return Billcountry;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getFax() {
		return Fax;
	}

	public WebElement getOtherphone() {
		return Otherphone;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getOwnership() {
		return Ownership;
	}

	public WebElement getSiccode() {
		return Siccode;
	}

	public WebElement getShipstreet() {
		return Shipstreet;
	}

	public WebElement getShippobox() {
		return Shippobox;
	}

	public WebElement getShipcity() {
		return Shipcity;
	}

	public WebElement getShipstate() {
		return Shipstate;
	}

	public WebElement getShipcode() {
		return Shipcode;
	}

	public WebElement getShipcountry() {
		return Shipcountry;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	

	//business logic
	public void OrganizationDetails(String ORGNAME,String WEBSITE,String OTHEREMAIL,String BILLINGADDRESS,String BILLINGPOBOX,String BILLINGCITY,String BILLINGSTATE,String BILLINGPORTALCODE,String BILLINGCOUNTRY,String PHONE,String FAX,String OTHERPHONE,String EMAIL,String OWNERSHIP,String SICCODE,String SHIPPINGADDRESS,String SHIPPINGPOBOX,String SHIPPINGCITY,String SHIPPINGSTATE,String SHIPPINGPOSTALCODE,String SHIPPINGCOUNTRY ) {
		OrgName.sendKeys(ORGNAME);
		Website.sendKeys(WEBSITE);
		Otheremail.sendKeys(OTHEREMAIL);
		Billingaddress.sendKeys(BILLINGADDRESS);
		Billpobox.sendKeys(BILLINGPOBOX);
		Billcity.sendKeys(BILLINGCITY);
		Billstate.sendKeys(BILLINGSTATE);
		Billcode.sendKeys(BILLINGPORTALCODE);
		Billcountry.sendKeys(BILLINGCOUNTRY);
		Phone.sendKeys(PHONE);
		Fax.sendKeys(FAX);
		Otherphone.sendKeys(OTHERPHONE);
		Email.sendKeys(EMAIL);
		Ownership.sendKeys(OWNERSHIP);
		Siccode.sendKeys(SICCODE);
		Shipstreet.sendKeys(SHIPPINGADDRESS);
		Shippobox.sendKeys(SHIPPINGPOBOX);
		Shipcity.sendKeys(SHIPPINGCITY);
		Shipstate.sendKeys(SHIPPINGSTATE);
		Shipcode.sendKeys(SHIPPINGPOSTALCODE);
		Shipcountry.sendKeys(SHIPPINGCOUNTRY);
	}
	
	public void SaveButton()
	{
		SaveButton.click();
	}
	

}
