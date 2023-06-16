package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.Filter;
import pompackage.Sort;
import pompackage.SortingAndFilter;

public class SortingAndFilterTest extends BaseAmazonClassA {

//	 Sort so=new Sort();
 //  Filter fi=new Filter();
	
      SortingAndFilter sf;
   
    public SortingAndFilterTest() {
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
		sf=new SortingAndFilter();
	}

	   @Test(priority=1)
		  public void SortFilter () throws InterruptedException {
			 
		  try {
				Thread.sleep(1000);
		     	sf.searchOption();
	       		sf.clickBtn();
	           Thread.sleep(3000);
	            sf.drop();
            Thread.sleep(4000);
		    sf.reviewDisplay();
		    Thread.sleep(5000);
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
   