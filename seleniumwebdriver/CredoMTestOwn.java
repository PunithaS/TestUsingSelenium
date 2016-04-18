package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CredoMTestOwn {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.credomobile.com/phones");
	  driver.findElement(By.xpath("//div[@id='divMatrix']/div[1]//button[@type='submit']")).click();
	  
	  
  }
}
