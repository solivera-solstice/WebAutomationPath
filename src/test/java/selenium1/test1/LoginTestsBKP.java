package selenium1.test1;
/*package selenium1.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTests {
		
	static WebElement flash;
	static WebElement logoutbutton;
	//public static WebDriver driver ;
	
	@BeforeTest
	public void openBrowser() {
		Login.initWebDriver();
		Login.elements();
	}
		
	
	@Test(priority=0)
	  public void validatefields() {

			// userbox
			boolean checkuserenabled = Login.userbox.isEnabled();
			
			if (checkuserenabled == true) {
			System.out.println("username is enabled");
			}
			else {
				System.out.println("username is enabled");
			}
			//passbox
			boolean checkpassenabled = Login.passbox.isEnabled();
			if (checkpassenabled == true) {
			System.out.println("password is enabled");
			}
			else {
				System.out.println("password is not enabled");
				
			}
			//button
			boolean checkbuttonenabled = Login.loginbutton.isEnabled();
			if (checkbuttonenabled == true) {
			System.out.println("button is enabled");
			}
			else {
				System.out.println("button is not enabled");
				}
	  }
	
	@Test(priority=1)
	  public void loguin() {

		
		Login.userbox.sendKeys("tomsmith");
		Login.passbox.sendKeys("SuperSecretPassword!");
		Login.loginbutton.click();
	}
	
	@Test(priority=2)
	 public void validatelogin() {

		
		 //flash = driver.findElement(By.id("flash-messages"));
		 flash = Login.driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		 
		 logoutbutton = Login.driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		 
		
		boolean checkflashdisplayed = flash.isDisplayed();
		if (checkflashdisplayed == true) {
			System.out.println("Flash is displayed");
		}
		else {
			
			System.out.println("Flash is not displayed");
		}

		String flashtext = flash.getText();
		System.out.println(flashtext);
		
		
		boolean checklogoutbutton = logoutbutton.isEnabled();
		if (checklogoutbutton == true) {
			System.out.println("Logout button is enabled");}
		else{
				System.out.println("Logout button not enabled");		
		
		}


	}
	}*/
	
