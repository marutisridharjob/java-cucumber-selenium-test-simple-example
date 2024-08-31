Feature: Example feature

  Scenario: Open Google and search
    Given I open Google
    When I search for "TestNG and Cucumber"
    Then I should see results