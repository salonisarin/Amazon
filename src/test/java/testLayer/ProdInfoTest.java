package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClassA;
import pompackage.ProdInfo;
import pompackage.Sort;

public class ProdInfoTest extends BaseAmazonClassA {
	
	ProdInfo pi;
	// private String name;
	
	public ProdInfoTest() {
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
		pi=new ProdInfo();
	}
	
	@Test(priority=1)
       public void relevantProd() throws InterruptedException {
	
		Thread.sleep(1000);
     	pi.searchOption();
  		pi.clickBtn();
       Thread.sleep(3000);
		String text=pi.textresult();
		Assert.assertEquals(text, "Results");// confirming relevant products are showing.
		System.out.println("Relevant prouducts are shown "+" ''" +text+ "'' ");
			}
	
	  @Test(priority=2)
	  public void numberOfProdsPerPage () throws InterruptedException {
	 try {
			Thread.sleep(1000);
	     	pi.searchOption();
      		pi.clickBtn();
           Thread.sleep(3000);
           pi.validate_total_count();
           Thread.sleep(3000);
		}
	 catch (InterruptedException e) {
	  	e.printStackTrace();
	}
	  }
	  @Test(priority=3)
	  public void ShowProdsDetails () throws InterruptedException {
		 
	 try {
			Thread.sleep(1000);
	     	pi.searchOption();
      		pi.clickBtn();
           Thread.sleep(3000);
           pi.get_text();
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
