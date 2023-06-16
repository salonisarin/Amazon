package pompackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.BaseAmazonClassA;

public class ProdInfo extends BaseAmazonClassA {

	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
    
//	 @FindBy(css = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-micro.puis-padding-right-micro > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a")
  //   WebElement  products; className a-size-base-plus a-color-base a-text-normal

 //   @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")
 //   List<WebElement>   products;
   
	 @FindBy(xpath="//span[contains(text(),'Results')]")
	 WebElement results;
	 
	//List -"total_count" is for all the products description in webelement format of page1
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal' or @class='a-size-base-plus a-color-base a-text-normal']")
	List<WebElement> total_count;
	
	//List-"element_description" is for storing description of all the products in string format of page1
	public static List<String> element_description=new ArrayList<String>();
		
	 public ProdInfo() {
		 
		 PageFactory.initElements(driver, this);
	 }
 

		  public void searchOption() { 
			  Search.sendKeys("Jeans for woman"); 
			  } 
		  public void clickBtn() { 
			  SearchBtn.click();
		  }
		 
		  public String textresult() {
				return results.getText();
			}
     
        public void validate_total_count() {
	       	int c=total_count.size();
	       Assert.assertEquals(c, 60,"Total number of products is not 60, it is "+c+".");
		}
//copy webelement values in List "total_count" to List "element_description" as text.
          	public void get_text() {
		
		for(WebElement i:total_count) {
			element_description.add(i.getText());
			 System.out.println(i.getText());
			}
		} 
}
