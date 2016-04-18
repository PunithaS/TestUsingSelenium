package williamsonoma;

import org.openqa.selenium.By;

public class Williamsonoma extends homepage {
	
	public void opensonoma(){
		
		driver.get("http://www.williams-sonoma.com/");
		driver.manage().window().maximize();
		}
		
		public void f(){
		driver.findElement(By.id("ad_email_btn-close")).click();
		}	
		
		public void x(){
		driver.findElement(By.linkText("WILLIAMS-SONOMA HOME")).click();
			}
		public Furniture openfurnituretab(){
			driver.findElement(By.linkText("Furniture")).click();
			return new Furniture();
		}

}
