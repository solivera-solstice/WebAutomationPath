package selenium1;

import selenium1.UIElements.LoginPage;

public class Actions {

	public static void openPage() {
		Driver.driver.get(TestScenarios.baseURL);
		TestScenarios.loginForm();
	}

	public static void fillFieldsLogin(String user, String pass) {
		LoginPage.userBox.sendKeys(user);
		LoginPage.passBox.sendKeys(pass);
	}

}
