package selenium1.UIElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium1.Driver;


public class dLoguinElements {
	

	public static WebElement flash;
	public static WebElement logoutbutton;
	
	public static void elements() {
		
	
		flash = Driver.driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		logoutbutton = Driver.driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		
	

}
		
	}


