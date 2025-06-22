package testclasses;

import Baseclasses.Firstclass;
import pagepackages.AssertionDemo;


import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AssertionDemoTest extends Firstclass  
{  
	AssertionDemo AssertionDemoObject;
	String username="sonali123456";

	@BeforeTest
	public void Opeeration() 
	{

		{
			setup();
			AssertionDemoObject = new AssertionDemo(driver);
		}
	}
	@Test(priority=1)
	public void  assertEqualToDemoTest() 
	{
		AssertionDemoObject.assertEqualToDemo();
	}

	@Test(priority=2)
	public void  assertFalseDemoTest() 
	{
		AssertionDemoObject.assertFalseDemo();
	}
	@Test(priority=3)
	public void  assertNotNullDemoTest() 
	{
		AssertionDemoObject.assertNotNullDemo(username);
	}
	@Test(priority=4)
	public void  softAssertionDemoTest() 
	{
		AssertionDemoObject.softAssertionDemo();
	}
	@Test(priority=5)
	public void  assertNotEqualDemoTest() 
	{
		AssertionDemoObject.assertNotEqualDemo();
	}
	@Test(priority=6)
	public void  assertTrueDemoTest() 
	{

		AssertionDemoObject.assertTrueDemo();
	}
	@AfterTest
	public void tearDownTest() {
		tearDown(); // 

	}
}