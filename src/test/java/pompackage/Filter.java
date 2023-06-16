package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClassA;

public class Filter extends BaseAmazonClassA {

	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	  
	@FindBy(css="#p_89\\/Amazon\\ Essentials > span > a > span")
	WebElement brandClick;
	
	@FindBy(css="#p_36\\/12035760011 > span > a > span")
	WebElement priceClick;
	
	@FindBy(css="#p_72\\/11192170011 > span > a > section > i")
	WebElement reviewClick;
	
	
         public Filter() {
		 
		 PageFactory.initElements(driver, this);
	
	 }
       
         public void searchOption() {
        	 Search.sendKeys("Jeans for woman");
    	 }
      public void clickBtn() { 
    	  SearchBtn.click();
      }
      

         public void brandDisplay() throws InterruptedException {
     	brandClick.click();
     	}
         public void priceDisplay() throws InterruptedException {
          	
          	priceClick.click();
         
          	}
         public void reviewDisplay() throws InterruptedException {
          	reviewClick.click();
          	
          	
          	}
         
}
