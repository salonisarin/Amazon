package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;
import testdata.ExcelSheet;

public class LoginTest extends BaseAmazonClass{
	PomLogin login;
	private String name;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiate();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		login=new PomLogin();
		}

	  @DataProvider public Object[][] Details(){ 
		  Object result[][]=ExcelSheet.readdata("Sheet1"); 
	    return result; 
	    }
		 
		  
		  @Test(priority=1, dataProvider="Details")
		  public void Login(String name,String email,String password,String passwordAgain) throws InterruptedException {
			 
		  try {
				Thread.sleep(1000);
				login.typeusername(name);
				Thread.sleep(1000);
				login.typeemail(email);
				Thread.sleep(1000);
				login.typepassword(password);
				Thread.sleep(1000);
				login.typepasswordAgain(passwordAgain);
				Thread.sleep(1000);
		     	login.clickBtn();
		     	Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		  
		/*
		 * @Test(priority=1 ) public void Signup() {
		 * 
		 * try { Thread.sleep(1000);
		 * 
		 * login.typeusername(prop.getProperty("name")); Thread.sleep(1000);
		 * 
		 * login.typeemail(prop.getProperty("email"));
		 * 
		 * login.typepassword(prop.getProperty("Password")); Thread.sleep(1000);
		 * 
		 * login.typepasswordAgain(prop.getProperty("PasswordAgain"));
		 * Thread.sleep(1000);
		 * 
		 * login.clickBtn(); Thread.sleep(6000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 */
		  
	@AfterMethod
	public void close() {
		driver.close();
		

	}
	
	
}
