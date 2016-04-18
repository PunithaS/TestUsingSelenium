
package williamsonoma;

import org.testng.annotations.Test;

public class williamsonomatest {
		Williamsonoma page= new Williamsonoma();
		Furniture fab = new Furniture();
	
	
	@Test(priority=1)
	public void test1() throws InterruptedException{
		page.opensonoma();
		page.f();
		Thread.sleep(5000);
		page.x();	
	}
	
	@Test(priority=2)
	public void test2() throws InterruptedException{
		page.openfurnituretab();
		Thread.sleep(5000);
	}
			
	@Test(priority=4)
	public void test4() throws InterruptedException{
		fab.occasionalchairs();
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public void test5(){		
		fab.fabriccushionfill();		
			}
	
	@Test(priority=6)
	public void test6() throws InterruptedException{		
		fab.AddToCART();
		Thread.sleep(5000);
	}
	/*
	@Test(priority=7)
	public void test7() throws InterruptedException{		
		fab.switchframe();
		Thread.sleep(5000);
	}*/
	@Test(priority=8)
	public void test8(){		
		fab.checkout();
		
	}

@Test(priority=9)
public void test9(){
	fab.saveforlater();
	fab.verifysaved();
}
	

}



