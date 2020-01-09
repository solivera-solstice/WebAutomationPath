package selenium1;

import selenium1.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium1.UIElements.LoguinPage;

public class Actions {
	
	public static void openpage() {
		
		Driver.IWebdriver();
		Driver.driver.get(TestScenarios.baseurl);
		TestScenarios.loginform();
	}
	
	public static void fillfieldsloguin(String user, String pass ) {
		
		LoguinPage.userbox.sendKeys(user);
		LoguinPage.passbox.sendKeys(pass);
		
		
	}

	
	
}
