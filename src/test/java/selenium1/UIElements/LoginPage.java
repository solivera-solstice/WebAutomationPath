package selenium1.UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium1.Driver;

public class LoginPage {

	public static WebElement userBox;
	public static WebElement passBox;
	public static WebElement loginButton;
	public static WebElement flash;

	public static void getElements() {
		userBox = Driver.driver.findElement(By.id(("username")));
		passBox = Driver.driver.findElement(By.id(("password")));
		loginButton = Driver.driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
	}
	
	public static void getFlash(){
		flash = Driver.driver.findElement(By.xpath("//*[@id=\"flash\"]"));
	}

}
