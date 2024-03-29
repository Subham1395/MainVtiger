package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	//declaration
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement contactlookUpImg;
	
	
	//initialization
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getContactlookUpImg() {
		return contactlookUpImg;
	}
	
	//business logic
	public void clickContact() {
		contactlookUpImg.click();
	}
}
