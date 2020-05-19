Feature: Set the text display size in accessibility option

  Scenario: Set text display size to Default
    Given that user is on the Display Size option
    And the size is not set to Default
    When user clicks the plus icon
    Then user should be able to set the size to default

  Scenario: Set text display size to Small
    Given that user is on the Display Size option
    And the size is not set to Small
    When user clicks the minus icon
    Then user should be able to set the Dispay size to small

