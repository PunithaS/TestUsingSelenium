package swd.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CostcoSamples {
  @Test
  public void f() {
	  WebDriver driver= new FirefoxDriver();
	  
	  driver.get("http://www.costco.com/all-laptops.html?ddkey=http:CatalogSearch");
	  String totalSearchResult= driver.findElement(By.xpath(".//*[@id='box']/div[5]/span")).getText();
		String strar[]=totalSearchResult.split(" of ");
		System.out.println((strar[strar.length-1]));
  }
}
