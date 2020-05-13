Feature: Change the text display size in accessibility option

  Scenario: Increase text display size
  Given that the API demos app is running
  When I access the accessibility service
  Then I should be able to increase the size to default

  Scenario: Increase text display size
    Given that the API demos app is running
    When I access the accessibility service
    Then I should be able to decrease the size to small
