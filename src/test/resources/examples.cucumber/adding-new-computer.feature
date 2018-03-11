Feature: Adding a new computer

  Scenario: user can enter a new computer

    Given an open browser with computer-database
    When click on 'Add a new computer' button
    And enter a new computer name Cucumber in field
    And select Nintendo from the list company
    And click on 'Create this computer' button
    Then computer has been created