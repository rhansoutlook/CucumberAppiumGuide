Feature: Change the List preference under default value for preferences

  Scenario: Set list preference Alpha option 1
    Given that I am in the list preference option
    When I click the Alpha 1 option
    Then Alpha 1 should become the default option

  Scenario: Set list preference Beta  option 2
    Given that I am in the list preference option
    When I click the Beta 2 option
    Then Beta 2  should become the default option

  Scenario: Set list preference Charlie  option 3
    Given that I am in the list preference option
    When I click the Charlie 3 option
    Then Charlie 3 should become the default option
