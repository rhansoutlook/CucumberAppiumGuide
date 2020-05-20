Feature: View Buttons

  @MobileNative
  Scenario: Toggle View Buttons On/Off
    Given that I am in the Views Buttons option
    When I click the on off toggle button
    Then the views should toggle on and off
