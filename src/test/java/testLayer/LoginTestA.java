package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.PomLoginA;

public class LoginTestA extends BaseAmazonClassA{
	
	PomLoginA log;
	
	public LoginTestA() {
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
		log=new PomLoginA();
		}
	
	
	 @Test(priority=1)
	 public void accDisplay() {	 	
		 
		  try { 
			  Thread.sleep(1000);
			log.accountDisplay();
		  Thread.sleep(1000); 
 } 
		  catch (InterruptedException e) { 
			  e.printStackTrace(); 
			  } 
		  }
	 
	 @Test(priority=2)
	 public void mouse() {
		 
		 try { 
			 Thread.sleep(1000);
			 log.mousehover();
			 Thread.sleep(1000);

			 }
		  catch (InterruptedException e) { 
				  e.printStackTrace(); 
				  } 
	 }
	 	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
