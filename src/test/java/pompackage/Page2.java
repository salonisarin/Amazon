package pompackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClassA;

public class Page2 extends BaseAmazonClassA{

	// list is used to fetch info of all the products like name,price and all products will save in products variable	  
 //   List <WebElement> products =driver.findElements(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-micro.puis-padding-right-micro > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a")); 

    //List -"total_count2" is for all the products description in webelement format of page2
	 @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal' or @class='a-size-base-plus a-color-base a-text-normal']")  
     List<WebElement> total_count2;

    //List-"element_description2" is for storing description of all the products in string format of page2
	 public static List<String> element_description2=new ArrayList<String>();
	 
	 public Page2 () {
			PageFactory.initElements(driver,this);
		}
		//copy webelement values in List "total_count2" to List "element_description2" as text.
		public void get_text() {
			for(WebElement i:total_count2) {
				element_description2.add(i.getText());
				}
	}
}
