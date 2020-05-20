Feature: Select a List Preference

  @MobileNative
  Scenario: Select Alpha option 01
    Given that I am in the List Preference option
    When I select Alpha option 01
    Then Alpha option 01 should become default option
