package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajiotest {
  @Test
  public void f() 
  {
	  //opening ajio
	  Reporter.log("Opening Ajio", true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.Ajio.in/");
	  //driver.quit();                       //close all the tabs
	  driver.close();
	 
  }
}
