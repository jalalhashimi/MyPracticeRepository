package stepDefinition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import pageObject.RetailPageObjectPractice;

public class RetailPageStepsPractice extends Base {
	
	RetailPageObjectPractice retailpageobj = new RetailPageObjectPractice();

	@Given("I am in the retail page")
	public void i_am_in_the_retail_page() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailpageobj.getEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Test Environment Text Successfully Displyed ");
	}

	@When("I click on My Account link")
	public void i_click_on_my_account_link() {
		retailpageobj.clickMyAccountLink();
		logger.info("Click on my Account was Successfully clicked ");
	}

	@And("I click on Login")
	public void i_click_on_login() {
		retailpageobj.clickLoginLink();
		logger.info("Click on login was Successfully clicked ");
	}

	@And("I enter email and password")
	public void i_enter_email_and_password() {
		retailpageobj.enterEmail("tigerstekschool003@gmail.com");
		retailpageobj.enterPassword("P@ssword");
		
		logger.info("Email was entered Successfully");
	}

	@And("I click on Login button")
	public void i_click_on_login_button() {
		retailpageobj.clickLoginBtton();
		logger.info("Login button was clicked Successfully");
	}

	@And("I click on register for an afiliate account")
	public void i_click_on_register_for_an_afiliate_account() {
		retailpageobj.clickRegisterForAffiliateAccountLink();
		logger.info("Click on register for an Affliate Account was clicked Successfully");
	}

	@And("I enter company name")
	public void i_enter_company_name() {
		retailpageobj.enterCompanyName("AirForce");
		logger.info("Company name was entered Successfully");
	}

	@And("I enter Web Site name")
	public void i_enter_web_site_name() {
		retailpageobj.enterWebsiteName("Afghan");
		logger.info("Website name was entered Successfully");
	}

	@And("I enter Tax ID")
	public void i_enter_tax_id() {
		retailpageobj.entertaxId("5MH56");
		logger.info("Tax ID was entered Successfully");
	}

	@And("I check the Radio button for Cheque")
	public void i_check_the_radio_button_for_cheque() {
		retailpageobj.clickRadioButt();
		logger.info("Radio button was selected Successfully");
	}

	@And("I enter Cheque Payee Name")
	public void i_enter_cheque_payee_name() {
		retailpageobj.enterChequePayeeText("Aviation");
		logger.info("Cheque Payee information was entered Successfully");
	}

	@And("I select About Us checkBox")
	public void i_select_about_us_check_box() {
		retailpageobj.clickAboutUsCheckBox();
		logger.info("About Us checkbox was selected successfully");
	}

	@Then("I click the Continue button")
	public void i_click_the_continue_button() {
		retailpageobj.clickContinueButton();
		logger.info("Continue button was clicked successfully");
	}
	
}


