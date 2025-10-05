Feature: Balance Retrieval

  @getBalance
  Scenario: Verify that the user can successfully retrieve their account balance
    Given create a user account using the register button
    Then click on the accounts overview link and navigate to the accounts overview page
    And get the account balance from the screen