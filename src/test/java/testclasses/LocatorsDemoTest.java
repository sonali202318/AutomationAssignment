package testclasses;
import Baseclasses.Firstclass;
import pagepackages.Secondclass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class LocatorsDemoTest extends Firstclass {
	JavascriptExecutor js;
	@BeforeTest
	public void Opeeration() 
	{

		{
			setup();
			Secondclass	newObject = new Secondclass(driver);
		}
	}

	@Test(priority=0)
	public void loginButtonClicked()
	{
		WebElement loginclick1=driver.findElement(By.id("menuUser"));
		loginclick1.click();
	}
	@Test(priority=1)
	public void enterUsername()
	{
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("sonali123456");
	}
	@Test(priority=2)
	public void enterPassword()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys("Sonali123456");
	}
	@Test(priority=3)
	public void signInButton()
	{
		WebDriverWait wait_signInButton = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement button = wait_signInButton.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign_in_btn")));
		button.click();
	}

	@Test(priority=4)
	public void clickOnTabletOption()
	{
		WebDriverWait wait_clickOnTabletOption = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement tabletOption = wait_clickOnTabletOption.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabletsTxt")));
		tabletOption.click();

	}
	@Test(priority=5)
	public void tableView()
	{

		WebDriverWait wait_tableView = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement seleteTabletOption = wait_tableView.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"16\"]")));
		seleteTabletOption.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500);");

	}
	@Test(priority=6)

	public void addToCart()
	{
		WebDriverWait wait_addToCart = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement cart = wait_addToCart.until(ExpectedConditions.visibilityOfElementLocated(By.name("save_to_cart")));
		cart.click();
	}
	@Test(priority=7)
	public void  CartView()
	{
		WebDriverWait wait_cartview = new WebDriverWait(driver, Duration.ofSeconds(200));
		WebElement cartview= wait_cartview.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuCart")));
		cartview.click();
	}
	@AfterTest
	public void tearDownTest() {
		tearDown(); 

	}
}