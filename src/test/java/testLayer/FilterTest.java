package testLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.Filter;
import pompackage.Sort;

public class FilterTest extends BaseAmazonClassA {

           Filter fi;
	
	public FilterTest() {
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
		fi=new Filter();
	}
	@Test(priority=1)
	  public void Filter () throws InterruptedException {
		 
	  try {
			Thread.sleep(1000);
			fi.searchOption();
			Thread.sleep(1000);
			fi.clickBtn();
			Thread.sleep(2000);
			fi.brandDisplay();
	  }
			catch (InterruptedException e) {
				e.printStackTrace();
				}
	  }
	@Test(priority=2)
	  public void Filter1 () throws InterruptedException {
		 
	  try {
		  Thread.sleep(1000);
			fi.searchOption();
			Thread.sleep(1000);
			fi.clickBtn();
			Thread.sleep(2000);
		    fi.priceDisplay();
	  }
			catch (InterruptedException e) {
				e.printStackTrace();
				}
	  }
	@Test(priority=3)
	 public void Filter2 () throws InterruptedException {
				 
	try {
		Thread.sleep(1000);
		fi.searchOption();
		Thread.sleep(1000);
		fi.clickBtn();
		Thread.sleep(2000);
		 fi.reviewDisplay();
		 Thread.sleep(10000);
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
