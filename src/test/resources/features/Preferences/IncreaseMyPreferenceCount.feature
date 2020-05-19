Feature: Increase the My Preference count in advanced preferences

  @MobileNative
  Scenario: Increase my preference count in advanced preference plus one
    Given that I am Advanced preferences option
    When I click on the My preference option
    Then the My preference current count should be increased by one
