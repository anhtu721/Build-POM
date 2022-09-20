package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.RegisterPageUI;

public class RegisterPageObjects extends BasePage {
	WebDriver driver;
	public RegisterPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void enterToFirstNameTextBox(String firstName) {
		waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
		sendkeysToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
	}
	public void enterToLastNameTextBox(String lastName) {
		waitForElementVisible(driver, lastName);
		sendkeysToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
	}
	public void enterToEmailTextBox(String email) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeysToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}
	public void enterToCompanyTextBox(String company) {
		waitForElementVisible(driver, RegisterPageUI.COMPANY_TEXTBOX);
		sendkeysToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, company);
	}
	public void enterToPasswordTextBox(String password) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeysToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
	}
	public void enterToConfirmPasswordTextBox(String confirmPassword) {
		waitForElementVisible(driver, RegisterPageUI.CONFIRMPASSWORD_TEXTBOX);
		sendkeysToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, confirmPassword);
	}
	public void clickToRegisterButton() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}
	
	public boolean isFirstNameErrorMessageDisplay(String message) {
		String value = getTextOfElement(driver, RegisterPageUI.FIRSTNAME_ERROR_MASSAGE);
		return message.contains(value);
	}
	public boolean isLastNameErrorMessageDisplay(String message) {
		String value = getTextOfElement(driver, RegisterPageUI.LASTNAME_ERROR_MASSAGE);
		return message.contains(value);
	}
	public boolean isEmailErrorMessageDisplay(String message) {
		String value = getTextOfElement(driver, RegisterPageUI.EMAIL_ERROR_MASSAGE);
		return message.contains(value);
	}
}
