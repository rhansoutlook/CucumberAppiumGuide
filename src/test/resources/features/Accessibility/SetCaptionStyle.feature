Feature: Set the caption style

  @MobileNative
  Scenario: Set Caption style to Black on white
    Given that I am on the Captions style option
    When I click the black on white option
    Then I should be able to set the caption style to Black on white

  @MobileNative
  Scenario: Set caption style to white on black
    Given that I am on the Captions style option
    When I click the white on black option
    Then I should be able to set the caption style to white on black

  @MobileNative
  Scenario: Set caption style to Yellow on Blue
    Given that I am on the Captions style option
    When I click the Yellow on Blue option
    Then I should be able to set the caption style to Yellow on Blue
