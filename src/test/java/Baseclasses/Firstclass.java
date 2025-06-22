package Baseclasses;
import utilsclasses.ConfigReader;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class Firstclass {
	 protected WebDriver driver;
	
	    public void setup() {
	        String browser = ConfigReader.get("browser");

	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        }

	        driver.manage().window().maximize();
	        driver.get(ConfigReader.get("baseUrl"));
	        
	    }

	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}