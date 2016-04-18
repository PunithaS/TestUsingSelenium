package williamsonoma;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Furniture 	extends  Williamsonoma {
		 
				
		public void occasionalchairs(){
			driver.findElement(By.linkText("Occasional Chairs")).click();
		}
		
		public void fabriccushionfill(){
			driver.findElement(By.linkText("Brentwood Woven Leather Chair")).click();
			
		}

		public void AddToCART()
		{
		driver.findElement(By.xpath(".//*[@id='pip']/div[1]/div[6]/div[2]/div[2]/section/div/div/fieldset[1]/button")).click();

		}
		
		/*public void switchframe(){
			String homepage = driver.getWindowHandle();
			Set <String> windows = driver.getWindowHandles();						
			Iterator iterator = windows.iterator();
			String currentwindowid;
			while(iterator.hasNext()){
				currentwindowid = iterator.next().toString();
				if(!currentwindowid.equals(homepage)){
					driver.switchTo().window(currentwindowid);}}
			}*/
		
		public void checkout(){
					
			        driver.findElement(By.id("anchor-btn-checkout")).click();
		}
		
		public void  saveforlater(){
			driver.findElement(By.linkText("Save For Later")).click();
		}
		
		public void verifysaved(){
			String txt=driver.findElement(By.xpath("//p[@class='save-for-later-message']")).getText();
			Assert.assertEquals(txt.contains("saved item."),true);
		}

}		
		

		






