Feature: Login page test

  Scenario: User can open Login page
    Given User opens home page
    When User opens Login page
    Then User sees Login page

  Scenario: User can close Login page
    Given User opens home page
    When User opens Login page
    And User closes login page
    Then User doesn't see Login page