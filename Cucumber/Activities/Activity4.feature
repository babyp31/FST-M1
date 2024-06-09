@activity4
Feature: Data Driven test with example

  @loginTest
  Scenario: testing with correct data
    Given  the user is on login page
    When the user enter "admin" and "password"
    And clicks submit button
    Then  get the confirmations text and verify message as Welcome Back, admin

