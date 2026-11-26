Feature: AlertHandling
  As a user I want to handle alerts

  Scenario: I can accept an alert
    As a user I wanna click alerts
    Given main page is open
    When I open the Alerts page
    And I make the alert appear
    And I accept the alert
    Then The success message appears