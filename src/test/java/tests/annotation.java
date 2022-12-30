package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {


	@BeforeSuite
	public void setup() { 
	    System.out.println("BeforeSuite"); 
	} 


	@BeforeTest
	public void openurl() { 
	    System.out.println("BeforeTest"); 
	} 

	@BeforeMethod
	public void openurl1() { 
	System.out.println("BeforeMethod"); 
	} 
	
	
	@Test 
	public void tc01() { 
	    System.out.println("Test1"); 
	} 

	@Test 
	public void tc_report() { 
	    System.out.println("Test2"); 
	} 

	@AfterMethod
	public void closeurl1() { 
	System.out.println("AfterMethod"); 
	} 
	
	
	@AfterTest
	public void closeurl() { 
	    System.out.println("AfterTest"); 
	} 

	@AfterSuite
	public void closeAll() { 
	    System.out.println("AfterSuite"); 
}
 
}