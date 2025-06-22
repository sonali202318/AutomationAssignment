package testclasses;
import Baseclasses.Firstclass;
import pagepackages.Secondclass;
import utilsclasses.ConfigReader;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Thridclass extends Firstclass  
{
	Secondclass newObject;
	@BeforeTest
    public void Opeeration() 
	   {
		
		{
			setup();
			newObject = new Secondclass(driver);
		}
	   }
	@Test(priority=2)
	public void fristOperation()
	{
	
		newObject.clickOnSpecialOfffer();
	}	
	@Test(priority=3)
	public void secondOperation()
	{

		newObject.selectBlueOptionfromList();
	}
	@Test(priority=4)
	public void thirdOperation()
	{

		newObject.displySelectedColor();
	}
	@Test(priority=5)
	public void fourthOperation()
	{

		newObject.addToCart();
	}
	@Test(priority=6)
	public void fifthOperation()
	{

		newObject.saveToCart();
	}
	@Test(priority=7)
	public void testValidLoginTest() {
        String user = ConfigReader.get("username");
        String pass = ConfigReader.get("password");
       System.out.print(user);
       System.out.print(pass);
    }
    
	@AfterTest
    public void tearDownTest() {
		tearDown(); // 
 
}
}
	

