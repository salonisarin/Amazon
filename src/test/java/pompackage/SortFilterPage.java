package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import basePackage.BaseAmazonClassA;

public class SortFilterPage extends BaseAmazonClassA {
	
	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	
	 @FindBy(css = "#s-result-sort-select")
	 WebElement Drop;

	 @FindBy(css="#p_72\\/11192170011 > span > a > section > i")
		WebElement reviewClick;
	 
	 @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal' or @class='a-size-base-plus a-color-base a-text-normal']")
		List<WebElement> total_count;
	
//		@FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(75) > div > div > span > a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator")	  
//	     WebElement NextBtn;
		
		@FindBy(xpath  = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[66]/div/div/span/a[3]")	  
	     WebElement NextBtn;
		
		 public SortFilterPage() {
			 
			 PageFactory.initElements(driver, this);
		 }
	 
	 public void searchOption() {
			 Search.sendKeys("Jeans for woman");
		 }
	 public void clickBtn() { 
		  SearchBtn.click();
	 
	}
	 public void drop() throws InterruptedException { 
		  Select obj=new Select(Drop); 
	  obj.selectByVisibleText("Price: Low to high"); 
	  Thread.sleep(2000); 
	  }
	 public void reviewDisplay() throws InterruptedException {
       	reviewClick.click();
  
       	
       	}
      
	 public void validate_total_count() {
	    	int c=total_count.size();
	    	System.out.println("Items on page: "+c+"");
	 //   Assert.assertEquals(c, 60,"Total number of products is not 60, it is "+c+".");
		}
	         
}
