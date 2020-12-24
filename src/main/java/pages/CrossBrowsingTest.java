package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsingTest {
	
	WebDriver driver ;
	public void browser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("Internet")) {
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
	}

}
