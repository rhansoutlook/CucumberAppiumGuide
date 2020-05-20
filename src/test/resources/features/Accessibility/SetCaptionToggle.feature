Feature: Captions

  @MobileNative
  Scenario: Set Caption Toggle On and Off
    Given that I am on the Captions option
    When I click the caption toggle switch
    Then I should be able to set the caption toggle to on or off
