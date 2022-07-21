package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;



public class RetailPageObjectPractice extends Base {
	public RetailPageObjectPractice() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliateAccountLink;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement webSiteTextField;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIdTextField;
	
	@FindBy(xpath = "//input[@name='payment'and @value='cheque']")
	private WebElement chequeRadioButton;
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeTextField;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckBox;
	
	@FindBy(xpath = "//input[@type='submit'and @class='btn btn-primary']")
	private WebElement continueButton;

	public String getEnvironmentText() {
		String getText = testEnvironmentText.getText();
		return getText;
	}

	public void clickMyAccountLink() {
		myAccountLink.click();
	}

	public void clickLoginLink() {
		loginLink.click();
	}

	public void enterEmail(String emailText) {
		email.sendKeys(emailText);
	}

	public void enterPassword(String passwordText) {
		password.sendKeys(passwordText);
	}

	public void clickLoginBtton() {
		loginButton.click();
	}

	public void clickRegisterForAffiliateAccountLink() {
		registerForAffiliateAccountLink.click();
	}

	public void enterCompanyName(String companyName) {
		companyTextField.sendKeys(companyName);
	}

	public void enterWebsiteName(String WebsiteNAme) {
		webSiteTextField.sendKeys(WebsiteNAme);
	}

	public void entertaxId(String textId) {
		taxIdTextField.sendKeys(textId);
	}

	public void clickRadioButt() {
		chequeRadioButton.click();
	}

	public void enterChequePayeeText(String chequeText) {
		chequePayeeTextField.sendKeys(chequeText);
	}

	public void clickAboutUsCheckBox() {
		aboutUsCheckBox.click();
	}

	public void clickContinueButton() {
		continueButton.click();
	}
}