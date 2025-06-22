package pagepackages;
import Baseclasses.Firstclass;


import utilsclasses.WaitUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.By;
import java.util.NoSuchElementException;
import org.testng.asserts.SoftAssert;


public class AssertionDemo extends Firstclass {

	WebDriver driver;
	WaitUtility wait;
	SoftAssert softAssert = new SoftAssert();
	// Constructor
	public AssertionDemo(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtility(driver);

	}
	String originPath="https://advantageonlineshopping.com/#/shoppingCart";
	String origintext="headphones";
	By clickonMice=By.id("speakersTxt");
	By menuCartNew=By.id("menuCart");
	By headphonesImg=By.id("headphonesImg");
	By laptopsImgNew=By.id("laptopsImg");
	By menuser=By.id("menuUser");
	By userName=By.name("username");
	By miceText=By.id("miceTxt");


	// Assert function 
	public void assertNotEqualDemo() {
		try {

			wait.waitForVisibility(clickonMice, 50);
			WebElement clickonMice1 = driver.findElement(clickonMice);
			utilsclasses.ScrollUtility.scrollToElement(driver, clickonMice1);
			String text=clickonMice1.getText();
			Assert.assertNotEquals("SPEAKERS1", text);
			System.out.println("assertNotEqualDemo Operation " + text);
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void assertEqualToDemo() {
		try {

			wait.waitForVisibility(menuCartNew, 50);
			wait.waitForClick(menuCartNew, 50);    
			WebElement menuCart1 = driver.findElement(menuCartNew);
			String text=menuCart1.getText();
			menuCart1.click();
			String path=driver.getCurrentUrl();
			Assert.assertEquals(originPath, path);
			System.out.println("assertEqualToDemo operation " + text);
			driver.navigate().back();
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void assertTrueDemo() {
		try {

			wait.waitForVisibility(headphonesImg, 50);
			//WebElement headphonesImg1 = driver.findElement(headphonesImg);
			Assert.assertTrue(origintext.contains("head"));
			System.out.println("assertTrueDemo operation " );
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void assertFalseDemo() {
		try {

			wait.waitForVisibility(laptopsImgNew, 50);
			WebElement laptopsImgNew1 = driver.findElement(laptopsImgNew);
			String laptopText=laptopsImgNew1.getText();
			Assert.assertFalse(laptopText.equals("LAPTOPS1"));
			System.out.println("assertFalseDemo  operation " );
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void assertNotNullDemo(String usrName1) {
		try {
			wait.waitForVisibility(menuser, 50);
			wait.waitForClick(menuser, 50);    
			driver.findElement(menuser).click();
			wait.waitForVisibility(userName, 50);
			driver.findElement(userName).sendKeys(usrName1);
			Assert.assertNotNull(userName);
			System.out.println("assertNotNullDemo  operation " );
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void softAssertionDemo() {
		try {
			wait.waitForVisibility(miceText, 50);
			WebElement miceTextNew = driver.findElement(miceText);
			utilsclasses.ScrollUtility.scrollToElement(driver, miceTextNew);
			String text=miceTextNew.getText();
			softAssert.assertNotEquals("MICE1", text);
			softAssert.assertAll();
			System.out.println("softAssertionDemo Operation ");
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}




}

