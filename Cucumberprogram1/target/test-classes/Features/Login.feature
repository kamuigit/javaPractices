Feature: 
  To validate login functionality

  Scenario: 
    To validate login by giving email id and password

    Given User have to enter into login page
    When user have to enter email and password
      | email    | Greens@gmail.com |
      | password | pythonsel        |
      | username | pytho22nsel      |
    And User have to click login button
    Then User should be in invalid credentials page
