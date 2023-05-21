@Test
Feature: Delete users

  Scenario: Delete User with valid ID
    Given delete User with valid ID
    When send request delete user
    Then should return status code 204

