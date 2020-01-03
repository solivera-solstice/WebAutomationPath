package selenium1.UIElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium1.Driver;


public class LoguinPage {
	
	public static WebElement userbox;
	public static WebElement passbox;
	public static WebElement loginbutton;
	public static WebElement flash;
	public static WebElement logoutbutton;
	
	
	public static void loginelements(){
	
		 userbox = Driver.driver.findElement(By.id(("username")));
		 passbox = Driver.driver.findElement(By.id(("password")));
		 loginbutton = Driver.driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		
	}
	

}
