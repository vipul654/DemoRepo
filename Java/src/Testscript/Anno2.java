package Testscript;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anno2 {
  @Test
	public void Search() 
	{
		
		System.out.println("Searchmail");
	
	
	}
   @BeforeTest
 public void beforeTest()
 {
	System.out.println("BeforeTest");
}
  @AfterTest
  public void afterTest()
  {
	System.out.println("AfterTest");
}
  @BeforeSuite
  public void beforesuit()
  {
	System.out.println("Beforesuite");
}
  @AfterSuite
  public void  aftersuite() 
  {
	System.out.println("AfterSute");
}
  
}
