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
  public void drop() throws InterruptedException { 
	  Select obj=new Select(Drop); 
   obj.selectByVisibleText("Price: Low to high"); 
   Thread.sleep(2000);
   obj.selectByVisibleText("Featured");
   Thread.sleep(2000);
   obj.selectByVisibleText("Price: High to low");
   Thread.sleep(2000);
   obj.selectByVisibleText("Avg. customer review");
   Thread.sleep(2000);
  
   obj.selectByVisibleText("Newest arrivals");  
   }
 

}
