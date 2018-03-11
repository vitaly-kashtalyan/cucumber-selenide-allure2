Feature: Computer database search

  Scenario: user can search computer by name (one computer found)

    Given an open browser with computer-database
    When  enter a name Apple Newton in filter field
    Then  the header should contain One computer found
    Then  top 1 matches should be shown
    Then  an item should be found

  Scenario: user can search computer by name (more than one computers found)

    Given an open browser with computer-database
    When  enter a name IBM in filter field
    Then  the header should contain computers found
    Then  top 10 matches should be shown
