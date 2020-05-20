Feature: Media Player Play Audio

  @MobileNative
  Scenario: Play Audio From Resources
    Given that I have selected the MediaPlayer option
    When I click play audio from resources
    Then the system should play audio
