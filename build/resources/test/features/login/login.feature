Feature: Login

  Scenario: Try to log in with credentials
    Given John is at the home of the app and agrees to log in
    When he sends his credentials
    Then He looks at the welcome message