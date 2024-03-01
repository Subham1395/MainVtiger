package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class consist of generic method of web driver handle
 * @param text
 * @param element
 */
public class WebDriverUtility {
    /**
     * this method will used to maximize the window
     * @param driver
     */
	public void windowmaximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method will used for synchronization
	 * @param driver
	 */
	public void waiIimplicitly(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method will used to capturing the visibletext
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method will used to click on check box
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClicable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this method will used to handle drop down by index
	 * @param element
	 * @param index
	 */
	 public void dropDownhandle(WebElement element, int index )
	 {
		 Select s = new Select(element);
		 s.selectByIndex(index);
	 }
	 /**
	  * this method will used to handle drop down by value
	  * @param element
	  * @param value
	  */
	 public void dropDownhandle(WebElement element, String value )
	 {
		 Select s = new Select(element);
		 s.selectByValue(value);
	 }
	 /**
	  * this method will used to handle drop down by visible text
	  * @param text
	  * @param element
	  */
	 public void dropDownhandle(String text, WebElement element)
	 {
		Select s = new Select(element);
		 s.selectByVisibleText(text);;
	 }
	 /**
	  * this method will used to click on element
	  * @param driver
	  * @param Element
	  */
	 public void clickOnElement(WebDriver driver, WebElement Element)
	 {
		 Actions act = new Actions(driver);
				act.moveToElement(Element).perform();; 
	 }
	 /**
	  * this method will used double click
	  * @param driver
	  * @param element
	  */
	 public void DoubleClick(WebDriver driver, WebElement element)
	 {
		 Actions act = new Actions(driver);
        act.doubleClick().perform();
	 }
	 /**
	  * this meth0od will used for right click
	  * @param element
	  * @param driver
	  */
	 public void rightClick(WebElement element, WebDriver driver) 
	 {
		 Actions act = new Actions(driver);
		 act.contextClick().perform();
	 }
	 /**
	  * this method will use for drag and drop 
	  * @param driver
	  * @param src
	  * @param trs
	  */
	 public void dragAndDrop(WebDriver driver,WebElement src, WebElement  trs)
	 {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, trs).perform();
	 }
	 public void moveAndClick(WebDriver driver)
	 {
		 Actions act = new Actions(driver);
		 act.moveByOffset(10, 10).click().perform();
	 }
	 /**
	  * this method will used for scroll down handle 500 units
	  * @param driver
	  */
	 public void scrollDownHandle(WebDriver driver)
	 {
		 JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("windows.by(0,500);", "");
	 }
	 /**
	  * this method will used for scroll up handle 500 units
	  * @param driver
	  */
	 public void scrollUpHandle(WebDriver driver)
	 {
		 JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("windows.by(0,--500);", "");
	 }
	 /**
	  * this method will used for switch to frame by index
	  * @param driver
	  * @param index
	  */
	 public void SwitchtoFrame(WebDriver driver, int index)
	 {
		 driver.switchTo().frame(index);
	 }
	 /**
	  * this method will used for switch to frame by Name and Id
	  * @param driver
	  * @param NameId
	  */
	 public void switchToFrame(WebDriver driver, String NameId) 
	 {
		 driver.switchTo().frame(NameId);
	 }
	 /**
	  * 
	  * @param element
	  * @param driver
	  */
	 public void switchToFrame( WebElement element,WebDriver driver)
	 {
		 driver.switchTo().frame(element);
	 }
	 /**
	  * this method will used for accept the alert pop up 
	  * @param driver
	  */
	 public void acceptAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().accept();
	 }
	 /**
	  * this method will use for dismiss the alert pop up  
	  * @param driver
	  */
	 public void dismissAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().dismiss();
	 }
	 /**
	  * this method will used for get the text from alert pop up 
	  * @param driver
	  */
	 public void getTextAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().getText();
	 }
	 /**
	  * this method will used for capture the ScreenShot
	  * @param driver
	  * @param screenshot
	  * @return
	  * @throws IOException
	  */
	 public String captureTheScreenshot(WebDriver driver, String screenshot ) throws IOException
	 {
		 TakesScreenshot ss=(TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File tsr = new File(".\\ScreenShot\\"+screenshot+".png");
		FileUtils.copyDirectory(src, tsr);
		
		return tsr.getAbsolutePath();
	 }
	 /**
	  * this method will used to switch window handle parent to any child 
	  * @param driver
	  * @param PartialWindowTitle
	  */
	 public void switchWindowHandle(WebDriver driver, String PartialWindowTitle)
	 {
		Set<String> allwindow = driver.getWindowHandles();	
		for(String window : allwindow)
		{
			String actualTitle = driver.switchTo().window(window).getTitle();
			if(actualTitle.contains(PartialWindowTitle))
			{
				break;
			}
		}
	 }
	 
	 
	 
}
