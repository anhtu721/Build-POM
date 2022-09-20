package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	
	public WebDriver getBrowserDriver(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if ( browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().arch64().setup();
			driver = new FirefoxDriver();
		}
		else {
			throw new RuntimeException("Please enter correct browser name.");
		}
		return driver;
	}
}

