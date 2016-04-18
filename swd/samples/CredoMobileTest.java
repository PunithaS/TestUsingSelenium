package swd.samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CredoMobileTest {

  //coverage page test
  WebDriver driver = new FirefoxDriver();
  @Test
  public void fTest() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.get("http://www.credomobile.com/coverage");
	  driver.switchTo().frame(1);// this will work if there is only one frame
	//  driver.switchTo().frame(driver.findElement(By.xpath("//div[@")))
	// driver.get("http://www.showmycoverage.com/mycoverage.jsp?id=WOR287TS&mapzip=");
	  driver.findElement(By.id("mapzip")).sendKeys("94538");
	  driver.findElement(By.id("mapit")).click();
	  WebDriverWait wait= new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("covaddr")));
	  
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String a=driver.findElement(By.id("covaddr")).getText();
	  System.out.println("Address is "+ a);
	  driver.quit();
  }
}
