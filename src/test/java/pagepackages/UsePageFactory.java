package pagepackages;
import utilsclasses.WaitUtility;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class UsePageFactory   {

	WebDriver driver;
	WaitUtility wait;

	// Constructor
	public UsePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WaitUtility(driver);
	}

	// PageFactory locators
	@FindBy(id = "menuUser")
	WebElement loginClick1;

	@FindBy(name = "username")
	WebElement userName1;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password1;

	//@FindBy(xpath = "//button[@type='button']")
	//WebElement loginButton;

	@FindBy(id = "sign_in_btn")
	WebElement loginButton;




	// Page Actions

	public void clickLogin() throws InterruptedException {
		try {

			Thread.sleep(200);
			wait.waitForVisibilityNew(loginClick1);
			wait.waitForClickableNew(loginClick1);
			loginClick1.click();
		}
		catch (NoSuchElementException  e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void enterUsername(String username) {
		try {
			wait.waitForVisibilityNew(userName1);
			userName1.sendKeys(username);
		}
		catch (NoSuchElementException  e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void enterPassword(String password) {
		try {
			wait.waitForVisibilityNew(password1);
			password1.sendKeys(password);
		}
		catch (NoSuchElementException  e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public void mainLogin() {
		try {
			wait.waitForVisibilityNew(loginButton);
			wait.waitForClickableNew(loginButton);
			loginButton.click();
		}
		catch (NoSuchElementException  e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}