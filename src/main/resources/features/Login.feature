Feature: Home Page Test
  Scenario: User valid login into web shop
    Given  User open browser and url
    When User enter valid username
    And User Enter Valid password
    And User click button login
    Then User go to page Dashboard

  Scenario: User invalid login into web shop
    When Click button logout
    And User enter invalid username
    And User Enter invalid password
    And User click button login
    Then Invalid credential



