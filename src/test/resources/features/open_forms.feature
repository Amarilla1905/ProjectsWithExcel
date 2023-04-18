Feature: Open Page of Forms
  I as user want open the page of Forms

  Scenario: Open Forms
    Given that the user opens the Forms page
    When he fills in the fields B and clicks on the submit button
      |people|
      | 1    |
    Then he can check that he has correctly saved the answers


