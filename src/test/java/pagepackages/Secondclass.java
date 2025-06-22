package pagepackages;
import utilsclasses.WaitUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Secondclass {

	WebDriver driver;
	WaitUtility wait;

	// Constructor
	public Secondclass(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtility(driver);
	}

	By clickonMice=By.id("miceImg");
	By selectColorOption=By.id("accordionColor");
	By selectedColor=By.id("productsColors3683D1");
	By addtoCartButton=By.id("27");
	By savetoCart=By.name("save_to_cart");


	// Page Actions
	//Click on search button 
	public void clickOnSpecialOfffer() {
		try {

			wait.waitForVisibility(clickonMice, 10);
			wait.waitForClick(clickonMice, 10);    
			WebElement clickonMice1 = driver.findElement(clickonMice);
			utilsclasses.ScrollUtility.scrollToElement(driver, clickonMice1);
			//btn.click();
			driver.findElement(clickonMice).click();
			System.out.println("Click on Special offfer"); 
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public void selectBlueOptionfromList() {
		try {
			wait.waitForVisibility(selectColorOption, 10);
			wait.waitForClick(selectColorOption, 10);
			WebElement selectColorOption1 = driver.findElement(selectColorOption);
			utilsclasses.ScrollUtility.scrollToElement(driver, selectColorOption1);
			driver.findElement(selectColorOption).click();
			System.out.println("click on Combo box for select color"); 
		}
		catch (Exception e) {
			System.out.println("Error of selection choice: " + e.getMessage());
		}
	}
	public void  displySelectedColor() {
		try {
			wait.waitForVisibility(selectedColor, 10);
			wait.waitForClick(selectedColor, 10);
			driver.findElement(selectedColor).click();
			System.out.println("Select color"); 
		}
		catch (Exception e) {
			System.out.println("Error during select color: " + e.getMessage());
		}
	}
	public void  addToCart() {
		try {
			wait.waitForVisibility(addtoCartButton, 10);
			wait.waitForClick(addtoCartButton, 10);
			driver.findElement(addtoCartButton).click();
			System.out.println("Product is add to cart"); 
		}
		catch (Exception e) {
			System.out.println("Error during add cart : " + e.getMessage());
		}
	}
	public void  saveToCart() {
		try {
			wait.waitForVisibility(savetoCart, 10);
			wait.waitForClick(savetoCart, 10);
			driver.findElement(savetoCart).click();
			System.out.println("Product is save to cart"); 
		}
		catch (Exception e) {
			System.out.println("Error during save cart: " + e.getMessage());
		}
	}
}

