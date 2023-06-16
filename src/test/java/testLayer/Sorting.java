package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;

import pompackage.Sort;

public class Sorting  extends BaseAmazonClassA {
	
	 Sort so;
		// private String name;
		
		public Sorting() {
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
			so=new Sort();
		}
		
		  @Test(priority=1)
		public void Sort () throws InterruptedException {
			 
		  try {
				Thread.sleep(1000);
		     	so.searchOption();
	       		so.clickBtn();
	           Thread.sleep(3000);
	            so.drop();
               Thread.sleep(4000);
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
