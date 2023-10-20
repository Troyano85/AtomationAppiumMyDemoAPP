Feature: add the product to the shopping cart
  Scenario:the user buys a product that is displayed
    Given The user logged in and is on the products page
    When  the user selects the product to add it to the cart
    Then the user must see the product added to the shopping cart