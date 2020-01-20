package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenarios {

	public static String baseURL = "https://the-internet.herokuapp.com";
	public static WebElement loginLink;

	public static void loginForm() {
		loginLink = Driver.driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a"));
	}

}
