package selenium1.test1;
import org.testng.annotations.Test;


import selenium1.TestScenarios;
import selenium1.UIElements.*;
import selenium1.Actions;


public class LoginTestCases {
	
	
	
	@Test(priority=0)
	public void clickloginform() {
	
	Actions.openpage();
	
	TestScenarios.loguinlink.click();
	}
	
	@Test(priority=1)
	public void loginfields() {
		
		LoguinPage.loginelements();
		
		
					// userbox to a boolean variable and check if is enabled
					boolean checkuserenabled = LoguinPage.userbox.isEnabled();
					if (checkuserenabled == true) {
					System.out.println("username is enabled");
					}
					else {
						System.out.println("username is enabled");
					}
					//passbox to a boolean variable and check if is enabled
					boolean checkpassenabled = LoguinPage.passbox.isEnabled();
					if (checkpassenabled == true) {
					System.out.println("password is enabled");
					}
					else {
						System.out.println("password is not enabled");
						
					}
					//loginbutton to a boolean variable and check if is enabled
					boolean checkbuttonenabled = LoguinPage.loginbutton.isEnabled();
					if (checkbuttonenabled == true) {
					System.out.println("button is enabled");
					}
					else {
						System.out.println("button is not enabled");
						}
	}
	
	
	@Test(priority=2)
	public void invalidloguin() {
		
		//Loguin
		Actions.fillfieldsloguin("tomsmith", "uperSecretPassword");
		LoguinPage.loginbutton.click();
		
	}
	
	
	@Test(priority=3)
	public void invalidloginvalidations() {
		
		dLoguinElements.elements();
		

		
		//Validate failed loguin message
		boolean checkflashdisplayed = dLoguinElements.flash.isDisplayed();
		if (checkflashdisplayed == true) {
			System.out.println("Flash is displayed");
		}
		else {
			
			System.out.println("Flash is not displayed");
		}

		String flashtext = dLoguinElements.flash.getText();
		System.out.println(flashtext);
		
		
		boolean checklogoutbutton = dLoguinElements.logoutbutton.isEnabled();
		if (checklogoutbutton == true) {
			System.out.println("Logout button is enabled");}
		else{
				System.out.println("Logout button not enabled");		
		
		}
		
	
		
	}
	
	
	
	
	
	

}
