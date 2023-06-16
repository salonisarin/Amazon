package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basePackage.BaseAmazonClassA;

public class SortingAndFilter extends BaseAmazonClassA {

	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	
	 @FindBy(css = "#s-result-sort-select")
	 WebElement Drop;

	 @FindBy(css="#p_89\\/Amazon\\ Essentials > span > a > span")
		WebElement brandClick;
		
		@FindBy(css="#p_36\\/12035760011 > span > a > span")
		WebElement priceClick;
		
		@FindBy(css="#p_72\\/11192170011 > span > a > section > i")
		WebElement reviewClick;
		
		
		
  public SortingAndFilter() {
		 
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
//  obj.selectByVisibleText("Featured");
//  Thread.sleep(2000);
//  obj.selectByVisibleText("Price: High to low");
//  Thread.sleep(2000);
//  obj.selectByVisibleText("Avg. customer review");
//  Thread.sleep(2000);
  // obj.selectByValue("e-desc-rank"); obj.selectByIndex(4);
 // obj.selectByVisibleText("Newest arrivals");  
  }
 public void reviewDisplay() throws InterruptedException {
	 reviewClick.click();
  	}
 
 
      
}