package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void Amzontest() 
  {
//amazon
  Reporter.log("Opening amazon", true);
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in");
  driver.close();
  }
}
