Feature: Register retail page

  @Practice
  Scenario: register for Affiliate Account
    Given I am in the retail page
    When I click on My Account link
    And I click on Login
    And I enter email and password
    And I click on Login button
    And I click on register for an afiliate account
    And I enter company name
    And I enter Web Site name
    And I enter Tax ID
    And I check the Radio button for Cheque
    And I enter Cheque Payee Name
    And I select About Us checkBox
    Then I click the Continue button
