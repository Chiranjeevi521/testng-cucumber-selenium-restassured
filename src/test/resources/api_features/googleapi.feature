Feature: To navigate to google using api

  @Api
  Scenario Outline: Cucumber Google
    Given I am on "<text>" search api page

    Examples:
      | text   |
      | google |
