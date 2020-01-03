package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Driver {
	public static WebDriver driver ;
	
	public static void IWebdriver() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");	
		driver = new ChromeDriver();
	 
	}
		
}
