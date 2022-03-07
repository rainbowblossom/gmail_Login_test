Feature: Gmail login functionality
  As a user i want to login in gmail account

  @Smoke
  Scenario: I should login with valid credentials successfully
    When I enter username "testqa5556@gmail.com"
    And  I click on next button
    And  I enter password "Abcd4567"
    And I click on next button
    Then I am able to login gmail account
    And I verify that gmail logo is displayed

  Scenario Outline: I should not login with invalid credentials
    When I enter username "<username>"
    And  I click on next button
    And  I enter password "<password>"
    And I click on next button
    Then  I can see "<error message>"

    Examples:
      | username             | password | error message    |
      | testqa5556@gmail.com |          | Enter a password |

  Scenario Outline: I should not login with invalid Username
    When I enter username "<username>"
    And  I click on next button
    Then  I can see error message "<error message2>"
    Examples:
      | username             | error message2                    |
      | testqa5557@gmail.com | Couldn't find your Google Account |
      | testqa5557@gmail.com | Couldn't find your Google Account |
      |                      | Enter an email or phone number    |

