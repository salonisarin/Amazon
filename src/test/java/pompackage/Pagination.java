package pompackage;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.BaseAmazonClassA;

public class Pagination extends BaseAmazonClassA {
	
	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	 
	// @FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(75) > div > div > span > a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator")	  
 //    WebElement NextBtn;
	// @FindBy(xpath  = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[66]/div/div/span/a[3]")	  
 //    WebElement NextBtn; 
	  @FindBy(linkText="Next")
	 WebElement NextBtn; 
	 @FindBy(xpath="//span[@aria-label='Current page, page 2']") 
	 WebElement page2;

	 @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal' or @class='a-size-base-plus a-color-base a-text-normal']")
	 List<WebElement> total_count;
	 
	// list is used to fetch info of all the products like name,price and all products will save in products variable	  
//	List <WebElement> products =driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-micro.puis-padding-right-micro > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a")); 
	 public static List<String> element_description=new ArrayList<String>();

    		public Pagination() {
		 
		 PageFactory.initElements(driver, this);
	 }
           public void searchOption() {
	       Search.sendKeys("Jeans for woman");
 }
          public void clickBtn() { 
         SearchBtn.click();
}

  			
	    public void nextBtn() throws InterruptedException { 
		//java executor is used to scroll down up in pages
	    	Thread.sleep(2000);
	    	JavascriptExecutor js= (JavascriptExecutor)driver; 
	    	js.executeScript("arguments[0].scrollIntoView();",NextBtn);
		//  js.executeScript("window.scrollBy(0,10000)");
		  Thread.sleep(3000);
		  NextBtn.click(); 
		//For 2nd page view to next button to confirm 2nd page is loaded
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			js.executeScript("arguments[0].scrollIntoView();",page2);
			Boolean page=page2.isDisplayed();
			Assert.assertEquals(true, page, "Page 2 not displayed");
			System.out.println("Page 2 is displayed");
	    }
	    
	    public void get_text() {
			
			for(WebElement i:total_count) {
				element_description.add(i.getText());
				}
			}
	  
	    

	

	  
	  
}