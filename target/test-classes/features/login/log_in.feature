Feature: Login

  Scenario: Try to log in with  credentials
    Given John is in the My Demo app and wants to login
    When He goes into the menu and looks for the login
    And he sends his credentials
    Then He looks at the welcome message