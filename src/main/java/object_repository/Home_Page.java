package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	//declaration
	@FindBy(linkText="Contacts")
	private WebElement ContactModule;
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationModule;
	
	@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstrationImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutLnk;
	
	
	//initialization
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getContactModule() {
		return ContactModule;
	}


	public WebElement getOrganizationModule() {
		return OrganizationModule;
	}


	public WebElement getadminstrationImg() {
		return adminstrationImg;
	}
	
	
	public WebElement getSignoutLnk() {
		return signoutLnk;
	}


	//business logic
    public void clickContactModule()
    {
    	ContactModule.click();
    }
    
    public void clickOrganizationModule()
    {
    	OrganizationModule.click();
    }
    public void logOut(WebDriver driver )
    {
    	Actions act = new Actions(driver);
    			act.moveToElement(adminstrationImg).perform();
    	signoutLnk.click();
    }
}
