package  utilsclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;




public class WaitUtility {
	WebDriver driver;
	public WebDriverWait wait;
	public WaitUtility(WebDriver driver) {
		//this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public  void waitForVisibility(By locator, int timeout) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(timeout))
			.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		catch (Exception e) {
			System.out.println("Error  in waitForVisibility : " + e.getMessage());
		}
	}

	public  void waitForClick(By locator, int timeout) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(timeout))
			.until(ExpectedConditions.elementToBeClickable(locator));
		}
		catch (Exception e) {
			System.out.println("Error  in waitForClick : " + e.getMessage());
		}
	}
	public void waitForVisibilityNew(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForClickableNew(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
