package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.Page2;
import pompackage.Pagination;
import pompackage.SortFilterPage;



public class SortFilterPageTest extends BaseAmazonClassA {

	
	 SortFilterPage sfp;
	 Pagination  page;
	   Page2 pg2;
	    public SortFilterPageTest() {
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
			sfp=new SortFilterPage();
			page=new Pagination();
			pg2=new Page2();
		}
		
		@Test(priority=1)

		public void pagination() throws InterruptedException {
				Thread.sleep(1000);
			sfp.searchOption();
			Thread.sleep(2000);
			sfp.clickBtn();
			  sfp.drop();
              Thread.sleep(2000);
              sfp.reviewDisplay();
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
			   
			   Thread.sleep(2000);
				 sfp.validate_total_count();
		}
			@AfterMethod
			public void close() {
				driver.close();
				
}
}
