package selenium1.UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium1.Driver;

public class HomePage {

	public static WebElement flash;
	public static WebElement logoutButton;

	public static void getElements() {
		flash = Driver.driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		logoutButton = Driver.driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
	}

}
