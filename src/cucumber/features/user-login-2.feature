Feature: Log in to user account

  Scenario Outline: Users can log in
    Given open website on http://dbankdemo.com/login
    When user enter User's <user email> and user <password>
    And user click on Sign In button
    Then User is logged

    Examples:
      | user email          | password |
      | jennifer43@mail.com | Pass1234 |
      | peter71@mail.com    | Pass1234 |
      | alicia18@mail.com   | Pass1234 |