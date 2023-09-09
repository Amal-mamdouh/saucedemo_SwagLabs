@smoke
Feature: Checkout |The user can check out the lowest price item

  Scenario: The user can order an item and check out it
    Given The user login to the website
    When The user Select lowest price item and add it to cart
    And The user navigate to the shopping cart page and click Checkout button
    And The user adds required data in the information screen:"<firstName>","<lastName>"and "zip/postcode"
    And The user click finish to complete checkout process
    Then The order is completed