package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.BaseAmazonClassA;

public class Search extends BaseAmazonClassA{
	
	
	@FindBy(id  = "twotabsearchtextbox") //driver.FindElement(By.
	 WebElement Search;
	
	 @FindBy(id = "nav-search-submit-button")
	 WebElement SearchBtn;
	 
	
	 
  public Search() {
		 
		 PageFactory.initElements(driver, this);
	 }
  
  public void searchOption(String sr) {
	  Search.sendKeys(sr);

	 }
  public void clickBtn() { 
	  SearchBtn.click();
  
}

}