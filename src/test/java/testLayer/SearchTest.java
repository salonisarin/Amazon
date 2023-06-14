package testLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import basePackage.BaseAmazonClassA;

import pompackage.Search;
import testdata.SearchDetails;


public class SearchTest extends BaseAmazonClassA{
	
	   Search se;
	// private String name;
	
	public SearchTest() {
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
		se=new Search();
	}
	
	 @DataProvider public Object[] SearchDetails(){ 
		  Object result[][]=SearchDetails.readdata("Sheet1"); 
	    return result; 
	    }
		 
		  
		  @Test(priority=1, dataProvider="SearchDetails")
		  public void Show(String s) throws InterruptedException {
			 
		  try {
				Thread.sleep(1000);
				se.searchOption(s);
				se.clickBtn();
	            Thread.sleep(8000);

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
