package selenium1;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Driver {
	public static WebDriver driver;

	public static void setup() {
		URL driverURL = ClassLoader.getSystemResource("chromedriver.exe");
		File driverFile = new File(driverURL.getFile());
		ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(driverFile)
				.usingAnyFreePort().build();

		driver = new ChromeDriver(service);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quit() {
		driver.quit();
	}

}
