package testclasses;

import Baseclasses.Firstclass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagepackages.UsePageFactory;
import utilsclasses.ConfigReader;

public class UsePageFactoryTest extends Firstclass  
{
	UsePageFactory	UsePageFactoryObject;
	


	@BeforeTest
	public void Opeeration() 
	{

		{
			setup();
			UsePageFactoryObject = new UsePageFactory(driver);
		}
	}


	@Test(priority=2)
	public void loginUserTest()throws InterruptedException  {



		UsePageFactoryObject.clickLogin();
	}

	@Test(priority=3)
	public void inputUserTest()  {

		String user = ConfigReader.get("username");
		//String pass = ConfigReader.get("password");
		System.out.print(user);
		// System.out.print(pass);
		UsePageFactoryObject.enterUsername(user);
	}
	@Test(priority=4)
	public void inputPasswaorTest()  {

		String pass = ConfigReader.get("password");
		UsePageFactoryObject.enterPassword(pass);
	}
	@Test(priority=5)
	public void mainLoginTest()  {


		UsePageFactoryObject.mainLogin();

	}
}




/*@AfterTest
public void tearDownTest() {
	tearDown(); 

}


}*/
