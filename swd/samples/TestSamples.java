package swd.samples;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class TestSamples {
	
 
	@Test
	public void test() {
		WebDriver df=new FirefoxDriver();
		df.get("http://www.google.com");
		System.out.println(df.getTitle());
		df.close();
	}

}
