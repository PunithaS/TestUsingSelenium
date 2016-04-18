package swd.samples;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

//import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
public class Credo {
	WebDriver driver= new FirefoxDriver();
	@Test
	public void testCredoPrice()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.credomobile.com/phones");
		//String priceinproductlist=driver.findElement(By.xpath("//div[@id='divMatrix']/div[1]/div[@class='border']/div[3]/div[2]/div[6]/label")).getText();
		String priceinproductlist=driver.findElement(By.xpath("//div[@id='divMatrix']/div[1]//div[@class='price']/label")).getText();
														
		System.out.println("Price is "+priceinproductlist);
		driver.findElement(By.xpath("//div[@id='divMatrix']/div[1]//button[@type='submit']")).click();
		driver.findElement(By.id("zip")).sendKeys("94538");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.id("choosePlanLink")).click();
		driver.findElement(By.xpath("//button[@data-id='numberOfDevices']")).click();
		driver.findElement(By.linkText("2"));
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();

	}
	
	@Test
	public void printCredoPrices()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.credomobile.com/phones");
		int noofphones=driver.findElements(By.xpath("//div[@id='divMatrix']/div[contains(@class,'phone')]")).size();
		
		for (int a=1;a<=noofphones;a++)
		{
			System.out.println(a+" phone price is "+driver.findElement(By.xpath("//div[@id='divMatrix']/div["+a+"]//div[@class='price']/label")).getText());
		}
		
	}

}
