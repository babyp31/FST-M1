@activity2
Feature: Activity to test login feature

  @loginTest
  Scenario: Successful login test
    Given  the user is on login page
    When user enter user name and password
    And clicks submit button
    Then  get the confirmations text and verify