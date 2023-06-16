package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.Page2;
import pompackage.Pagination;



public class PaginationTest extends BaseAmazonClassA {
	

	   Pagination  page;
	   Page2 pg2;
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
		pg2=new Page2();
	}

	@Test(priority=1)

	public void pagination() throws InterruptedException {
		Thread.sleep(1000);
		page.searchOption();
		Thread.sleep(2000);
		page.clickBtn();
		page.get_text();
		page.nextBtn(); 
		pg2.get_text();
		//Compare Lists for products uniqueness
		//boolean equal=compareLists(Page2.total_count2, Pagination.total_count);
		  boolean areEqual = Page2.element_description2.equals(Pagination.element_description);
		//  System.out.println(Pagination.element_description.get(0));
	//	  System.out.println(Page2.element_description2.get(0));
		   Assert.assertEquals(areEqual, false,"Products are repeated");
		   System.out.println("Products are unique");
	}
	
		@AfterMethod
		public void close() {
			driver.close();
			
}

}
