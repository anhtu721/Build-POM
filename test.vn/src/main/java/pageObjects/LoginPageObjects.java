package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.LoginPageUI;


public class LoginPageObjects extends BasePage {
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterToEmailTextbox(String email) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX );
		sendkeysToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}
	
	public void enterToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX );
		sendkeysToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}
	
	public HomePageObjects clickToLoginButton(WebDriver driver, String loginButton) {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToLoginButton(driver, LoginPageUI.LOGIN_BUTTON);
		return new HomePageObjects(driver);
	}

}
