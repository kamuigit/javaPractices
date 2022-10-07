@forgotpass
Feature: 
  To validate login functionality

  Background: 
    Given User have to enter into login page
    And User have to click login button
    Then User should be in invalid credentials page

  @smoke @regression
  Scenario: 
    To validate login by giving email id and password

    When user have to enter valid email and valid password

  @sanity
  Scenario: 
    To validate login by giving invalid details

    When user have to enter invalid email and invalid password
