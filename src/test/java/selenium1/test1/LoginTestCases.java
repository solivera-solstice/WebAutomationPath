package selenium1.test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium1.Actions;
import selenium1.Driver;
import selenium1.TestScenarios;
import selenium1.UIElements.HomePage;
import selenium1.UIElements.LoginPage;

public class LoginTestCases {

	public String baseURL = "https://the-internet.herokuapp.com";

	@BeforeTest
	public void setBaseURL() {
		Driver.setup();
	}

	@AfterTest
	public void endSession() {
		Driver.quit();
	}

	@Test(priority = 0)
	public void clickLoginForm() {
		Actions.openPage();
		TestScenarios.loginLink.click();
	}

	@Test(priority = 1)
	public void loginFields() {
		LoginPage.getElements();

		// userbox to a boolean variable and check if is enabled
		boolean checkUserEnabled = LoginPage.userBox.isEnabled();

		if (checkUserEnabled == true) {
			System.out.println("username is enabled");
		} else {
			System.out.println("username is not enabled");
		}

		// passbox to a boolean variable and check if is enabled
		boolean checkPassEnabled = LoginPage.passBox.isEnabled();

		if (checkPassEnabled == true) {
			System.out.println("password is enabled");
		} else {
			System.out.println("password is not enabled");
		}

		// loginbutton to a boolean variable and check if is enabled
		boolean checkButtonEnabled = LoginPage.loginButton.isEnabled();

		if (checkButtonEnabled == true) {
			System.out.println("button is enabled");
		} else {
			System.out.println("button is not enabled");
		}
	}

	@Test(priority = 2)
	public void invalidLogin() {
		// Login
		Actions.fillFieldsLogin("tomsmith", "SuperSecretPassword");
		LoginPage.loginButton.click();
	}

	@Test(priority = 3)
	public void invalidLoginValidations() {
		LoginPage.getElements();
		LoginPage.getFlash();

		// Validate failed login message
		boolean checkFlashDisplayed = LoginPage.flash.isDisplayed();

		if (checkFlashDisplayed == true) {
			System.out.println("Flash is displayed");
		} else {
			System.out.println("Flash is not displayed");
		}

		String flashText = LoginPage.flash.getText();
		System.out.println(flashText);
		LoginPage.getElements();

		boolean checkLogoutButton = LoginPage.loginButton.isEnabled();

		if (checkLogoutButton == true) {
			System.out.println("Login button is enabled");
		} else {
			System.out.println("Login button not enabled");
		}
	}

	@Test(priority = 4)
	public void validLogin() {
		LoginPage.getElements();
		Actions.fillFieldsLogin("tomsmith", "SuperSecretPassword!");
		LoginPage.loginButton.click();
	}

	@Test(priority = 5)
	public void validLoginValidations() {
		HomePage.getElements();

		// Validate failed login message
		boolean checkFlashDisplayed = HomePage.flash.isDisplayed();

		if (checkFlashDisplayed == true) {
			System.out.println("Flash is displayed");
		} else {
			System.out.println("Flash is not displayed");
		}

		String flashText = HomePage.flash.getText();
		System.out.println(flashText);

		boolean checkLogoutButton = HomePage.logoutButton.isEnabled();

		if (checkLogoutButton == true) {
			System.out.println("Logout button is enabled");
		} else {
			System.out.println("Logout button not enabled");
		}
	}

}
