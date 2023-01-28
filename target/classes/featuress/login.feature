Feature: Login to Secure Page
  As a user
  In order to go to Secure Page
  I neeed to login with Valid CredB
  Background:
    Given a user navigates to home page
    When  a user click on form authentcation
    Then the user should be directed to home page



Scenario: User can login with valid username and valid password
#Given A user opens Chrome Browser
#And A user navigates to home page
#And A user clicks on Form Authentication
When A user login with a valid username and a valid password
Then Verify that User is redirected to Secure page
#And The browser is closed

Scenario: User can't login with invalid email and valid password
#Given A user opens Chrome Browser
#And A user navigates to home page
#And A user clicks on Form Authentication
When A user login with invalid username and invalid password
#Then Verify that error message is dispalyed with invalid username
#And The browser is closed