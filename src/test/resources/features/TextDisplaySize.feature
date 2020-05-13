Feature: Change the text display size in accessibility option

  Scenario: Set text display size to Default
    Given that I am in the Display Size option
    When I click the plus icon
    Then I should be able to set the size to default

  Scenario: Set text display size to Small
    Given that I am in the Display Size option
    When I click the minus icon
    Then I should be able to set the Dispay size to small

