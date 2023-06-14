package pompackage;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClassA;

public class Pagination extends BaseAmazonClassA {
	
	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	 
	 @FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(75) > div > div > span > a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator")	  
     WebElement NextBtn;
	 
	 //Element locator for Next Button
 // no such element: Unable to locate element: {"method":"link text","selector":"s?k=jeans+for+women&page=2&crid=310EQ66H5277&qid=1686693114&sprefix=%2Caps%2C232&ref=sr_pg_1"}	
//used all the following element locators,got same error mentioned above
	 
  // @FindBy(linkText ="s?k=jeans+for+women&page=2&crid=310EQ66H5277&qid=1686693114&sprefix=%2Caps%2C232&ref=sr_pg_1") //driver.FindElement(By.
	// WebElement NextBtn;
	
	 
//	 @FindBy(xpath =  "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[67]/div/div/span/a[3]")	  
//	 WebElement NextBtn;
	 
 //   @FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(75) > div > div > span > a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator")	  
 //    WebElement NextBtn;
   
//with className, its not even searching the category on search box
 //  @FindBy(className  = "s-pagination-item s-pagination-next s-pagination-button s-pagination-separator")
//   WebElement NextBtn;
    
// Element locator css of first product  
//  @FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(76) > div > div > span > span.s-pagination-item.s-pagination-selected")
 //  WebElement showProd;
    		
    		public Pagination() {
		 
		 PageFactory.initElements(driver, this);
	 }
           public void searchOption() {
	       Search.sendKeys("Jeans for woman");
 }
          public void clickBtn() { 
         SearchBtn.click();
}

//just to see if next button is working
    //      public void nextOption() { 
	//      JavascriptExecutor js = (JavascriptExecutor)driver; 
    //      js.executeScript("window.scrollBy(0,10000)"); 
    //      NextBtn.click();
//  }
 
	    public void showProduct() throws InterruptedException { 
		//java executor is used to scroll down up in pages
	    	JavascriptExecutor js= (JavascriptExecutor)driver; 
		  js.executeScript("window.scrollBy(0,10000)");
		  
//here list is used to fetch info of all the products like name,price and all products will save in products variable	  
       List <WebElement> products =driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(76) > div > div > span > span.s-pagination-item.s-pagination-selected")); 

       //its empty array list, so productsNames variable will list all the products in form of arrays  
       List<String> productsNames= new ArrayList();

//for loop is used to add all the products/webElements listed in products variable and in for loop one by one it will fetch web elements of all products on that particular page and add in array list
	  for(WebElement names: products) { 
		  productsNames.add(names.getText()); //to get text of products name
	      System.out.println(names.getText()); //display products name one by one on console
	      }
	  
	     System.out.println("*****************************");

	//while loop is used because we have to fetch products info from every page one by one repeatedly 
	  while(true) {
	  
	  Thread.sleep(3000);
	  NextBtn.click(); 
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,9000)");
	  Thread.sleep(3000); 
	  products =driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(76) > div > div > span > span.s-pagination-item.s-pagination-selected"));

 //for loop is used again because we have fetch products info of next pages so for loop is added in while loop as well till last page
	  for(WebElement names: products) {
		  productsNames.add(names.getText());
	    System.out.println(names.getText()); 
	    }
	    System.out.println("*****************************");

//till next button is visible,it will run the loop but when it reaches last page,next button will be disabled then it will give exception of element not found so to handle that exception,use try catch block
	  try { 
		  NextBtn=driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(75) > div > div > span > a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator"));
		  } 
	    catch(Exception e) {
	  System.out.println("No More Products");
	  break; // to stop the loop
	  } 
	  }
	  System.out.println("*****************************");
	  System.out.println("Number of Products: "+ productsNames.size());
	  
	  }
}