package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	//declaration
	@FindBy(name="user_name")
	private WebElement UserNameTxt;
	
	@FindBy(name="user_password")
	private WebElement passwordTxt;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	//initialization
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getUserNameTxt() {
		return UserNameTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//business logic
	public void login_Page(String Username, String Password)
	{
		UserNameTxt.sendKeys(Username);
		passwordTxt.sendKeys(Password);
		loginbutton.click();
	}
	
	

}
