Feature: To search in google

  @Regression
  Scenario Outline: Cucumber Google
    Given I am on "<text>" search page
    When I type "<text1>"
    Then I click search button
    Then I clear search textbox
    Examples:
      | text   | text1    |
      | google | cucumber |
