@Test
Feature: Get users

  Scenario: Get user without parameter
    Given the user without parameter
    When sent request user
    Then should return status code 200

    Scenario Outline: Get user with parameter gender
      Given the user with gender "<gender>"
      When sent request user
      Then should return status code 200
      And validate data user gender should be "<gender>"
      Examples:
        | gender |
        | male   |

  Scenario Outline: Get user with parameter name
    Given the user with name "<name>"
    When sent request user
    Then should return status code 200
    And validate data user name should be contain "<name>"
    Examples:
      | name |
      | oki  |

  Scenario Outline: Get user with parameter status
    Given the user with status "<status>"
    When sent request user
    Then should return status code 200
    And validate data user status should be "<status>"
    Examples:
      | status   |
      | active   |
      | inactive |

  Scenario Outline: Get user with parameter email
    Given the user with email "<email>"
    When sent request user
    Then should return status code 200
    And validate data user email should be contain "<email>"
    Examples:
      | email     |
      | @johnston |






