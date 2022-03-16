Feature: Use discount code

  Background:
    Given open browers
    And go to shop page
    And add product to basket
    And open basket view

    Scenario: use correct code
      When user input correct code
      Then discount is added to product price


      Scenario: incorrect code
        When user input incorrect code
        Then discount is not added to product price

