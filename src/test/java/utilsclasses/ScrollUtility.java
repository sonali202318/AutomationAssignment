package utilsclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class ScrollUtility 
{
	WebDriver driver;

	public ScrollUtility(WebDriver driver) {
		this.driver = driver;
	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			System.out.println("Scroll failed: " + e.getMessage());
		}
	}


}
