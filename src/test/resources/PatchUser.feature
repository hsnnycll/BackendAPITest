@Test
Feature: Patch users

  Scenario: Update user with valid ID and valid request body
    Given update user with valid ID and request body
    When send request patch user with valid params
    Then should return status code 200






