package AutoamtionPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingBrowsersRunTime_WebDriverInterface {
	
	public static String browser = "Chrome";
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		if(browser.contentEquals("Chrome"))
			
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browser.contentEquals("Firefox"))
			
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://facebook.com");
		
		
	}

	

}
