

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\Browser Driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		

	}

}
