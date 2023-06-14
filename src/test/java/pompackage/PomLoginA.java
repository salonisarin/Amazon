package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClassA;

public class PomLoginA extends BaseAmazonClassA {
	
	
	

	@FindBy(css= "#nav-link-accountList-nav-line-1")
	WebElement Display;
	
	@FindBy(css="#nav-al-your-account > a:nth-child(2) > span")
	WebElement Click;
			
 public PomLoginA() {
		 
		 PageFactory.initElements(driver, this);
	
	 }

 
 public void accountDisplay() { 
	
	 boolean a= Display.isDisplayed();
	 System.out.println(a);
	 
 }

 public void mousehover() { 
 Actions action = new Actions(driver);
// action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
 action.moveToElement(Display).build().perform();
 Click.click();
 }

 
 

}
