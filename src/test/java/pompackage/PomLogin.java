package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;
import testLayer.LoginTest;

public class PomLogin extends BaseAmazonClass{
	
	
	@FindBy(css  = "#ap_customer_name") //driver.FindElement(By.
	 WebElement Username;
	 @FindBy(css = "#ap_email") 
	 WebElement Email;
	 @FindBy(css = "#ap_password")
	 WebElement Password;
	 @FindBy(id = "ap_password_check")
	 WebElement PasswordAgain;
	 @FindBy(css = "#continue")
	 WebElement ContinueBtn;
	 

	 
	 public PomLogin() {
		 
		 PageFactory.initElements(driver, this);
	 }
       
	 public void typeusername(String name) {
		 Username.sendKeys(name);
	 }
	  
	 public void typeemail(String email) {
		  Email.sendKeys(email); 
		  }
	 
	 public void typepassword(String pass) { 
		  Password.sendKeys(pass);
	  }
	 public void typepasswordAgain(String passagain) { 
			  PasswordAgain.sendKeys(passagain);
		  }
	 public void clickBtn() { 
		  ContinueBtn.click();
		  
		  }
	
		 
}

