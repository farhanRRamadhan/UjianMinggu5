Feature: add to cart
  Scenario:User add to cart
    Given User open browser and url
    When User click menu shop tools
    And User click tshirt
    And User add color
    And User add size
    And User add qty
    And User click button add to cart
    Then User go to main menu cart
