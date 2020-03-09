Feature: Log in to Digital Bank

  Scenario: User can log in to bank account

    Given open website on http://dbankdemo.com/login
    When user enter User's jennifer43@mail.com and user Pass1234
    And user click on Sign In button
    Then User is logged
