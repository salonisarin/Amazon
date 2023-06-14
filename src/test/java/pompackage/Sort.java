package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import basePackage.BaseAmazonClassA;

public class Sort  extends BaseAmazonClassA{
	
	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	
	 @FindBy(css = "#s-result-sort-select")
	 WebElement Drop;
 
 public Sort() {
		 
		 PageFactory.initElements(driver, this);
	 }
  
  public void searchOption() {
		 Search.sendKeys("Jeans for woman");
	 }
  public void clickBtn() { 
	  SearchBtn.click();
  
}
  public void drop() { 
	  Select obj=new Select(Drop); 
   obj.selectByVisibleText("Price: Low to high"); 
   // obj.selectByValue("e-desc-rank"); obj.selectByIndex(4);
   }
  
 
  public void numberProducts() {
	  
//		giving result as 0 not 60
//	List <WebElement> objList=driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(76) > div > div > span > span.s-pagination-item.s-pagination-selected"));
//	System.out.println("Count of number of products per page is:"+objList.size());
	
//		giving result as 0 not 60  
//	List products = driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(76) > div > div > span > span.s-pagination-item.s-pagination-selected"));
//	System.out.println("Count of number of products per page is:"+products.size() );
	
    //(not finding element with classname)
	//List <WebElement> objList= driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
//	System.out.println("Count of number of products per page is:"+objList.size());
	  
	 
//	giving result as 1 not 60 
	 List <WebElement> objList= driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div"));
	 System.out.println("Count of number of products per page is:"+objList.size()); 
	 
	// searching element locator for second product, id=MAIN-SEARCH_RESULTS-4  
//		giving result as 0 not 60
//	 List <WebElement> objList= driver.findElements(By.id("MAIN-SEARCH_RESULTS-4"));
//	System.out.println("Count of number of products per page is:"+objList.size());  
	
 // searching element locator for second product, css #search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(8)
//		giving result as 0 not 60
//	  List <WebElement> objList= driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(8)"));
//	System.out.println("Count of number of products per page is:"+objList.size());  
  
  }
  
 


}
