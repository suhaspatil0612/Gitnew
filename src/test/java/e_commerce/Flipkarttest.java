package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkarttest {
  @Test
  public void f() 

  {
//added text to check 
	  Reporter.log("Opening Flipkart", true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.close();
	  
	  
	  
  }
}
