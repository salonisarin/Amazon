package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.Pagination;



public class PaginationTest extends BaseAmazonClassA {
	

	   Pagination  page;
	// private String name;
	
	public PaginationTest() {
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
		page=new Pagination();
	}

	@Test(priority=1)
	  public void Show () throws InterruptedException {
		 
	  try {
			Thread.sleep(1000);
			page.searchOption();
			Thread.sleep(2000);
			page.clickBtn();
			Thread.sleep(9000);
	   //  	page.nextOption();
			page.showProduct();
            Thread.sleep(9000);
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
