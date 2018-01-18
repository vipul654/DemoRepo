package Testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation
{
	@Test
	public void login() 
	{
		
		System.out.println("Login Test");
		
	}
	
	public void reg()
	{
		System.out.println("R");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afteMethod() 
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	
	
	
}
