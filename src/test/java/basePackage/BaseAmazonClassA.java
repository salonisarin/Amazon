package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class BaseAmazonClassA {
	
	public static Properties prop= new Properties();	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Select sel;
	
	public BaseAmazonClassA()  {
	 try {
			FileInputStream file= new FileInputStream("C:\\Users\\sarin\\eclipse-workspace\\Amazon\\src\\test\\java\\environmentvariables\\Config.properties");
		     prop.load(file);
		} 

		    catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		    catch(IOException a) {
			a.printStackTrace();
		}
			}
		
		//step 2 method
		   public static void initiate() {
			//driver path
			   //max page load,implicit,getting url
			   //
			 String browsername= prop.getProperty("browser");
			 if (browsername.equals("Firefox")) {
				 System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				 driver= new FirefoxDriver();
				 }
				 else if(browsername.equals("chrome")) {
					 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					 ChromeOptions op=new ChromeOptions();
					 op.addArguments("--remote-allow-origins=*");
						
					  driver=new ChromeDriver(op);
				//	 driver=new ChromeDriver();
				 }
			 driver.manage().window().maximize();
		//	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			// driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			// Thread.sleep(500);
			 driver.get(prop.getProperty("Url1"));
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		   }

}
