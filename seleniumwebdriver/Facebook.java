package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
	/*	String exp_title="Welcome to facebook";
		if (exp_title.equals(title))
		{
			System.out.println("title is tested");
		}

		else
		{
			System.out.println("title is incorrect");
		} */
	WebElement fname= driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div[1]/div/input"));
	fname.sendKeys("Punitha");
	WebElement lname= driver.findElement(By.xpath(".//*[@id='u_0_d']"));
	lname.sendKeys("Madhavan");
	
	WebElement month = driver.findElement(By.xpath(".//*[@id='month']"));
	Select mon= new Select(month);
	mon.selectByVisibleText("Jun");
	
	WebElement day=driver.findElement(By.xpath(".//*[@id='day']"));
	Select dy=new Select(day);
	dy.selectByVisibleText("23");
	
	
	WebElement year=driver.findElement(By.xpath(".//*[@id='year']"));
	Select yy=new Select(year);
	yy.selectByVisibleText("1980");
	
	WebElement female=driver.findElement(By.xpath(".//*[@id='u_0_q']/span[1]/label"));
	female.click();
	
	WebElement male=driver.findElement(By.xpath(".//*[@id='u_0_q']/span[2]/label"));
	male.click();
	
	}

}
