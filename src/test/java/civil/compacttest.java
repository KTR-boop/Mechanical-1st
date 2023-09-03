package civil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class compacttest {
  @Test
  public void foundation1() throws InterruptedException 
 {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium folder\\New folder\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(Options) ;
	  
		driver.get("https://www.jio.com/");
		
	   // Assert.fail();
	 	Thread.sleep(3000);
	    
	    driver.close();
	    driver.quit();
		
	  
	  
	  
	  
	  
	  
  }
}
